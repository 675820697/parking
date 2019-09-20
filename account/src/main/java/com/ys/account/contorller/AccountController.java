package com.ys.account.contorller;

import com.ys.account.common.Result;
import com.ys.account.entity.User;
import com.ys.account.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 汤先生
 */
@RestController
public class AccountController {
    @Resource
    UserMapper userMapper;
    @RequestMapping ("/test")
    public User test (){

        return userMapper.selectByPrimaryKey(1);

    }
}
