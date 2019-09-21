package com.ys.pay.controller;

import com.ys.pay.domain.entity.Car;
import com.ys.pay.service.CarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author ljx
 */
@RestController
public class CarController {
    @Resource
    CarService carService;

    @RequestMapping("into")
    public int carInto(Car car){
        return carService.carInto(car);
    }
    @RequestMapping("/out")
    public int carOut(int uid,String outTime){
        return carService.carOut(uid,outTime);
    }
    @RequestMapping("/allTime")
    public Car carTime(int uid){
        return carService.allTime(uid);
    }
}
