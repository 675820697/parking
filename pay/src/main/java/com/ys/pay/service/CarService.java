package com.ys.pay.service;

import com.ys.pay.domain.entity.Car;

/**
 * @author ljx
 */
public interface CarService {

    /**
     * 汽车进入停车场 摄像头记录信息
     * @param car
     * @return
     */
    int carInto(Car car);

    /**
     * 汽车离开停车场
     * @param uid
     * @return
     * @param outTime
     */
    int carOut(int uid,String outTime);

    /**
     * 汽车在停车场的进出时间时间
     * @param uid
     * @return
     */
    Car allTime(int uid);
}
