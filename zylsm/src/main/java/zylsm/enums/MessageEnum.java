package zylsm.enums;

/**
 * @author qinbangshuai
 * @date 2019/12/9 10:38:55
 */
public enum MessageEnum {
    success("SUCCESS", "操作成功"),
    error("error","操作失败"),

    accountExists("accountExists","账号已被注册！"),
    phoneExists("phoneExists","手机号码已被注册！"),
    noAccount("noAccount","账号不存在"),


    passwrodNoMatch("passwrodNoMatch","密码错误！")





    ;

    private String code;

    private String message;


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    MessageEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
