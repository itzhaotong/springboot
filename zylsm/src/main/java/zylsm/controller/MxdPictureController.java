package zylsm.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zylsm.pojo.MxdPicture;
import zylsm.respone.QueryResult;
import zylsm.service.MxdPictureService;

@RestController
@RequestMapping("mxd")
@Api("图片管理接口")
public class MxdPictureController {

    @Autowired
    private MxdPictureService mxdPictureService;

    @PostMapping("insert")
    @ApiOperation(value = "保存")
    public void insertMxdP(@RequestBody MxdPicture mp) {
        mxdPictureService.insert(mp);
    }

    @GetMapping("getList")
    @ApiOperation(value = "分页查询数据")
    public QueryResult getList(Integer page) {
        return mxdPictureService.getList(page);
    }
}
