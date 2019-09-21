package com.ys.pay;


import com.ys.pay.domain.entity.Car;
import com.ys.pay.mapper.CarMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayApplicationTests {
    @Resource
    CarMapper carMapper;
    @Test
    public void contextLoads() {
        Car select = carMapper.select(2);
        Date pIntoTime = select.getPIntoTime();
        Date pOutTime = select.getPOutTime();

        //原本日期格式Fri Sep 20 11:40:50 CST 2019
        log.error("进入的时间{}",pIntoTime);
        log.error("出去的时间{}",pOutTime);

        //转成long类型 1568950850000
        long time = pIntoTime.getTime();
        long time1 = pOutTime.getTime();
        log.error("进入的时间{}",time);
        log.error("出去的时间{}",time1);

        //错误示范
        long time2=time1-time;
        Date date = new Date(time2);
        log.error("停车时间{}",date);

        //转换格式 2019-9-20 20:15:56
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //汽车进入的时间
        String format = simpleDateFormat.format(pIntoTime);
        //汽车出去时间
        String format1 = simpleDateFormat.format(pOutTime);


        //将格式 2019-9-20 20:15:56 转成 毫秒并求差
        long y=0;
        long x=0;
        try {
            long i = simpleDateFormat.parse(format).getTime();
            long o=simpleDateFormat.parse(format1).getTime();

            //计算要保留的小数点
            DecimalFormat decimalFormat = new DecimalFormat("0.00");

            y=o-i;

            String format2 = decimalFormat.format(y / 60000);

            log.error("相差分钟{}",format2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
