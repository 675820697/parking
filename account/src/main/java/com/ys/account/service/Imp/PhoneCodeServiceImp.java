package com.ys.account.service.Imp;

import com.ys.account.entity.PhoneCode;
import com.ys.account.mapper.PhoneCodeMapper;
import com.ys.account.service.PhoneCodeService;
import com.ys.account.utils.Code;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 汤先生
 */
@Service
public class PhoneCodeServiceImp implements PhoneCodeService {
    @Resource
    PhoneCodeMapper phoneCodeMapper;


    @Override
    public int forgetCode(String phone) {
        //查询是否存在
        PhoneCode byPhone = phoneCodeMapper.findByPhone(phone);
        int code = Code.getCode();
        if (byPhone!=null){
            int i = phoneCodeMapper.updateByPhone(phone, code);
            return i;
        }else {
            PhoneCode phoneCode = new PhoneCode();
            phoneCode.setCode(code);
            phoneCode.setPhone(phone);
            int insert = phoneCodeMapper.insert(phoneCode);
            return insert;
        }
    }

    @Override
    public boolean queryCode(String phone, int code) {
        PhoneCode byPhone = phoneCodeMapper.findByPhone(phone);
        if (byPhone!=null&&byPhone.getCode().equals(code)){
            return true;
        }
        return false;
    }
}
