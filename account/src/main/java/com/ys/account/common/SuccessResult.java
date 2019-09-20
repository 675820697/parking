package com.ys.account.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汤先生
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessResult<T> implements Result {

    private int status;
    private String msg;
    private T data;
    public static SuccessResult success() {
        return new SuccessResult(Constants.SUCCESS_STATUS, Constants.SUCCESS_MSG,null);
    }
    public static <T> SuccessResult success(T  data) {
        return new SuccessResult(Constants.SUCCESS_STATUS, Constants.SUCCESS_MSG,data);
    }
}
