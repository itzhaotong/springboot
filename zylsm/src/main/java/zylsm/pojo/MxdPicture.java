package zylsm.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MxdPicture implements Serializable {

    private Integer id;
    private String pName;
    private String pictureUrl;
    private Date createTime;
    private String tetal;
    private String content;
    private String price;
    private String grop;
}
