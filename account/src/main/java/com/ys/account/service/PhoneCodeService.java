package com.ys.account.service;

import com.ys.account.entity.PhoneCode;

/**
 * @author 汤先生
 */
public interface PhoneCodeService {
    /**
     * 忘记密码发送验证码
     * @param phone
     * @return
     */
    int forgetCode (String phone);


    boolean queryCode (String phone , int code );

}
