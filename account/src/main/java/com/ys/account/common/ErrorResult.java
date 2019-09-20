package com.ys.account.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汤先生
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResult implements Result {
    private int status;
    private String msg;
    public static ErrorResult error() {
        return new ErrorResult(Constants.ERROR_STATUS, Constants.ERROR_MSG);
    }

}
