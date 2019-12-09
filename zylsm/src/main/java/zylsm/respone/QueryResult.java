package zylsm.respone;

import lombok.Data;
import zylsm.enums.MessageEnum;

/**
 * 统一返回结构
 *
 * @author qinbangshuai
 * @date 2019/12/9 10:23:07
 */

public class QueryResult<T> {
    /**
     * 状态码
     */
    private String code;

    /**
     * 返回内容
     */
    private String msg;

    /**
     * 数据对象
     */
    private T data;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public QueryResult() {
    }

    public QueryResult(MessageEnum messageEnum, T data) {
        this.code = messageEnum.getCode();
        this.msg = messageEnum.getMessage();
        this.data = data;
    }

    public QueryResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
