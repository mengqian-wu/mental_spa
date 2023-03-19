package cit59x.hackathon.mental_placeblog.vo;

public enum RespBeanEnum {
    //common
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "SERVER ERROR"),

    //for login
    LOGIN_ERROR(500210, "Invalid email address and/or password"),
    EMAIL_ERROR(500211, "Invalid email address format"),
    USER_NOT_EXIST(500212, "User does not exist"),
    PASSWORD_UPDATE_FAIL(500213, "Password update failed"),
    SESSION_ERROR(500214, "SESSION not exist"),

    //for password
    PASSWORD_FORMAT_ERROR(500400, "Must contain at least 6 characters"),
    PASSWORD_MATCH_ERROR(500401, "Password don't match"),

    //for purchase
    EMPTY_STOCK(500500, "Purchase failed: Sold out!"),
    REQUEST_ILLEGAL(500501, "Illegal Request"),
    ERROR_CAPTCHA(500502, "Verification failed, please re-verify"),
    ACCESS_LIMIT_REACHED(500503, "Too many requests, please try again later"),

    //for orders
    ORDER_NOT_EXIST(500300, "Order not exist"),

    ;

    private final Integer code;
    private final String message;

    RespBeanEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
