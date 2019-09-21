package com.ys.pay.service.impl;

import com.ys.pay.domain.entity.Car;
import com.ys.pay.mapper.CarMapper;
import com.ys.pay.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ljx
 */
@Service
@Slf4j
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


    /**
     * 返回汽车在停车场的时间(单位:分钟)
     * @param uid
     * @return
     */
    @Override
    public String allTime(int uid) {
        Car select = carMapper.select(2);
        Date pIntoTime = select.getPIntoTime();
        Date pOutTime = select.getPOutTime();

        //原本日期格式Fri Sep 20 11:40:50 CST 2019
              //转成long类型 1568950850000
        long time = pIntoTime.getTime();
        long time1 = pOutTime.getTime();

        //错误示范
        long time2=time1-time;
        Date date = new Date(time2);


        //转换格式 2019-9-20 20:15:56
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //汽车进入的时间
        String format = simpleDateFormat.format(pIntoTime);
        //汽车出去时间
        String format1 = simpleDateFormat.format(pOutTime);


        //将格式 2019-9-20 20:15:56 转成 毫秒并求差
        long y=0;
        long x=0;
        String format2=null;
        try {
            long i = simpleDateFormat.parse(format).getTime();
            long o=simpleDateFormat.parse(format1).getTime();

            //计算要保留的小数点
            DecimalFormat decimalFormat = new DecimalFormat("0.00");

            y=o-i;

             format2 = decimalFormat.format(y / 60000);


        } catch (ParseException e) {
            e.printStackTrace();
        }

        return format2;
    }
}

