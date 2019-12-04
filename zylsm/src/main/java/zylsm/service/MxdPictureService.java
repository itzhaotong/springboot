package zylsm.service;

import java.util.Map;

import zylsm.pojo.MxdPicture;

public interface MxdPictureService {

	Map<String, Object> getList(Integer page);

	void insert(MxdPicture mp);

}
