package com.ys.pay.common;

/**
 * @author 响应信息
 */

public enum ResponseStatus {
    /*
        成功状态码200
     */
    SUCCESS(200,"成功"),
    /*
    错误状态码404
     */
    ERROR(404,"错误请求");
    private Integer status;
    private  String msg;

    ResponseStatus(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
