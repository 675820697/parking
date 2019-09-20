package com.ys.pay.domain.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author 停车场车辆
 */
@Data
public class Car {
    /**
    * 停车id
    */
    private Integer pId;

    /**
    * 车牌号
    */
    private String pNumber;

    /**
    * 汽车进入时间
    */
    private Date pIntoTime;

    /**
    * 状态值,0表示车进入停车场;1表示离开停车场
    */
    private Byte pStatus;

    /**
    * 汽车出场时间
    */
    private Date pOutTime;

    /**
    * 用户ID
    */
    private Integer uid;


}