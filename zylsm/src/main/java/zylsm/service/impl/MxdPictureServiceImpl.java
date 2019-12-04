package zylsm.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zylsm.mapper.MxdPictureMapper;
import zylsm.pojo.MxdPicture;
import zylsm.service.MxdPictureService;
@Service
public class MxdPictureServiceImpl implements MxdPictureService {
	
	private Integer pageSize = 20;

	@Autowired MxdPictureMapper mxdPictureMapper;
	
	public Map<String, Object> getList(Integer page) {
		Integer pages = getPages(page);
		List<MxdPicture> list = mxdPictureMapper.getList(pages,pageSize);
		Integer total = mxdPictureMapper.getTotal();
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("data", list);
		result.put("total", total);
		result.put("totalPage", getTotalPages(total));
		return result;
	}

	public void insert(MxdPicture mp) {
		mp.setCreateTime(new Date());
		mxdPictureMapper.insert(mp);
	}
	
	
	public Integer getPages(Integer page) {
		return page * pageSize;
	}
	
	public Integer getTotalPages(Integer total) {
		return (total  +  pageSize  - 1) / pageSize;
	}
	

}
