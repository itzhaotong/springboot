package zylsm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zylsm.enums.MessageEnum;
import zylsm.mapper.MxdPictureMapper;
import zylsm.pojo.MxdPicture;
import zylsm.respone.QueryResult;
import zylsm.service.MxdPictureService;
import zylsm.vo.MxdPictureVo;

@Service
public class MxdPictureServiceImpl implements MxdPictureService {
	
	private Integer pageSize = 20;

	@Autowired MxdPictureMapper mxdPictureMapper;

	@Override
	public QueryResult getList(Integer page) {
		Integer pages = getPages(page);
		List<MxdPictureVo> list = mxdPictureMapper.getList(pages,pageSize);
		Integer total = mxdPictureMapper.getTotal();

		Map<String,Object> result = new HashMap<>();
		result.put("data", list);
		result.put("total", total);
		result.put("totalPage", getTotalPages(total));

		return new QueryResult<>(MessageEnum.success,result);
	}

	@Override
	public void insert(MxdPicture mp) {
		mxdPictureMapper.save(mp);
	}
	
	
	public Integer getPages(Integer page) {
		return page * pageSize;
	}
	
	public Integer getTotalPages(Integer total) {
		return (total  +  pageSize  - 1) / pageSize;
	}
	

}
