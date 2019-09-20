package com.ys.pay.mapper;

import com.ys.pay.domain.entity.Car;

public interface CarMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}