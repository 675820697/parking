package com.ys.account.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liuya
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private String msg;
    private T data;
    private int status;

    public static Result success(Object obj){
        Result result = new Result();
        result.setData(obj);
        result.setMsg(Constants.SUCCESS_MSG);
        result.setStatus(Constants.SUCCESS_STATE_200);
        return result;
    }
    public static Result success(){
        Result result = new Result();
        result.setData(null);
        result.setMsg(Constants.SUCCESS_MSG);
        result.setStatus(Constants.SUCCESS_STATE_200);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setMsg(Constants.ERROR_MSG);
        result.setStatus(Constants.ERROR_STATE_404);
        return result;
    }

}
