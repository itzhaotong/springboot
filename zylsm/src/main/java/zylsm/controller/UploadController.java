package zylsm.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import zylsm.constant.FileConstant;

@RestController
@RequestMapping("upload")
public class UploadController {

    @RequestMapping("Files")
    public Map<String, Object> uploadMaterial(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        Map<String, Object> Result = new HashMap<String, Object>();
        try {
            String fileName = file.getOriginalFilename();

            String suffixName = fileName.substring(fileName.lastIndexOf("."));

            if (!(suffixName.contains("jpg") || suffixName.contains("png"))) {
                Result.put("erro", "不支持" + suffixName + "格式,请上传JPG或者PNG格式");
                return Result;
            }
            // 生成文件名称通用方法
            StringBuilder tempName = new StringBuilder();
            tempName.append(System.currentTimeMillis())
                    .append(UUID.randomUUID().toString().replace("-", "")).append(suffixName);
            String newFileName = tempName.toString();

            File fileDirectory = new File(FileConstant.Files);
            // 创建文件
            File destFile = new File(FileConstant.Files + newFileName);
            if (!fileDirectory.exists()) {
                if (!fileDirectory.mkdir()) {
                    throw new IOException("文件夹创建失败,路径为：" + fileDirectory);
                }
            }
            file.transferTo(destFile);
            Result.put("data", newFileName);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return Result;
    }
}
