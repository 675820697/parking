package com.ys.account.entity;

import lombok.Data;

@Data
public class User {
    /**
    * 用户ID
    */
    private Integer uid;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 状态码0是正常
    */
    private String status;

    /**
    * 用户电话号码
    */
    private String phone;
}