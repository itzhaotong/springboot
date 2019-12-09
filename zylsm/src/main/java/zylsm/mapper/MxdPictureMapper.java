package zylsm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zylsm.pojo.MxdPicture;
import zylsm.vo.MxdPictureVo;

public interface MxdPictureMapper {

	Integer getTotal();

	void save(MxdPicture mp);

	List<MxdPictureVo> getList(@Param("pages")Integer pages, @Param("pageSize")Integer pageSize);

}
