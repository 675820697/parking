package com.ys.account.mapper;

import com.ys.account.entity.PhoneCode;
import org.apache.ibatis.annotations.Param;

public interface PhoneCodeMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(PhoneCode record);

    int insertSelective(PhoneCode record);

    PhoneCode selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(PhoneCode record);

    int updateByPrimaryKey(PhoneCode record);

    /**
     *  验证码
     * @param phone
     * @param code
     * @return
     */
    int updateByPhone (@Param("phone") String phone, @Param("code") Integer code);

    /**
     * 根据电话号码查询
     * @param phone
     * @return
     */
    PhoneCode findByPhone (@Param("phone") String  phone);
}