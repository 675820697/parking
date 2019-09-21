package com.ys.account.entity;

import lombok.Data;

@Data
public class PhoneCode {
    private Integer cid;

    private Integer code;

    private String phone;
}