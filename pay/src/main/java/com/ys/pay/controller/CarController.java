package com.ys.pay.controller;

import com.ys.pay.domain.entity.Car;
import com.ys.pay.service.CarService;
import com.ys.pay.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author ljx
 */
@RestController
@Slf4j
public class CarController {
    @Resource
    CarService carService;

    @RequestMapping("into")
    public Result carInto(Car car){
        try {
            return Result.success(carService.carInto(car));
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Result.error();

    }
    @RequestMapping("/out")
    public Result carOut(int uid,String outTime){
        try {
            return Result.success(carService.carOut(uid,outTime));
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Result.error();

    }
    @RequestMapping("/allTime")
    public Result carTime(int uid){

        try {
            return Result.success(carService.allTime(uid));
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Result.error();

    }
}
