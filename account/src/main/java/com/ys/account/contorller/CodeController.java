package com.ys.account.contorller;

import com.ys.account.entity.PhoneCode;
import com.ys.account.mapper.PhoneCodeMapper;
import com.ys.account.service.PhoneCodeService;
import com.ys.account.utils.Result;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 汤先生
 */
@RestController
public class CodeController {

    @Resource
    PhoneCodeService phoneCodeService;

    @RequestMapping("/queryCode")
    public  Result queryCode (String phone,Integer code){
        boolean b = phoneCodeService.queryCode(phone, code);
        if (b){
            return  Result.success();
        }else {
            return Result.error();
        }
    }

    @RequestMapping("/forgetCode")
    public Result forgetCode (String phone){
        int i = phoneCodeService.forgetCode(phone);
        return Result.success(i);
    }
}
