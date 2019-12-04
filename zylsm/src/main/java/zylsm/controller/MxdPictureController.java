package zylsm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zylsm.pojo.MxdPicture;
import zylsm.service.MxdPictureService;

@RestController
@RequestMapping("mxd")
public class MxdPictureController {

	@Autowired private MxdPictureService mxdPictureService;
	
	@PostMapping("insert")
	public void insertMxdP(@RequestBody MxdPicture mp) {
		mxdPictureService.insert(mp);
	}
	
	@GetMapping("getList")
	public Map<String,Object> getList(Integer page){
		return mxdPictureService.getList(page);
	}
}
