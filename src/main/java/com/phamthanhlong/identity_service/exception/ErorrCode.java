package com.phamthanhlong.identity_service.exception;

public enum ErorrCode {
    RUNTIME_EXCEPTION(9999,"runtime exception"),
    USER_EXSITED(1002, "User exited"),
    VALIDATION(1003, "invalid type input"),
    USER_NOTFOUND(1004,"not found user"),
    USERNOT_EXISTED(1005,"user not exit"),
    UNAUTHENTICATED(1006,"unauthenticated"),
    ;
    private int code;
    private String message;


    ErorrCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
