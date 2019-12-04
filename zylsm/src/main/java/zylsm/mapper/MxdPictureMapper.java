package zylsm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zylsm.pojo.MxdPicture;

public interface MxdPictureMapper {

	Integer getTotal();

	void insert(MxdPicture mp);

	List<MxdPicture> getList(@Param("pages")Integer pages,@Param("pageSize")Integer pageSize);

}
