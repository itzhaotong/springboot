package zylsm.service;

import zylsm.pojo.MxdPicture;
import zylsm.respone.QueryResult;

public interface MxdPictureService {

	QueryResult getList(Integer page);

	void insert(MxdPicture mp);

}
