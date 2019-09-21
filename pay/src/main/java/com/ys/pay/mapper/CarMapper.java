package com.ys.pay.mapper;

import com.ys.pay.domain.entity.Car;
import org.apache.ibatis.annotations.Param;

/**
 * @author ljx
 */
public interface CarMapper {
    /**
     *添加Car
     * @param car
     * @return
     */
    int insert(@Param("car") Car car);

    /**
     * 更新状态值
     * @param uid
     * @return i
     * @param outTime
     */
    int update(@Param("uid")int uid,@Param("outTime") String outTime);

    /**
     * 查询时间
     * @param uid
     * @return
     */
    Car select(int uid);

}