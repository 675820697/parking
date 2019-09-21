package com.ys.pay.service.impl;

import com.ys.pay.domain.entity.Car;
import com.ys.pay.mapper.CarMapper;
import com.ys.pay.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ljx
 */
@Service
public class CarServiceImpl implements CarService {
    @Resource
    CarMapper carMapper;
    @Override
    public int carInto(Car car) {
        return carMapper.insert(car);
    }

    @Override
    public int carOut(int uid,String outTime) {
        return carMapper.update(uid,outTime);
    }

    @Override
    public Car allTime(int uid) {

        return carMapper.select(uid);
    }
}

