package com.ys.account.contorller;

import com.ys.account.entity.User;
import com.ys.account.service.AccountService;
import com.ys.account.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 汤先生
 */
@RestController
public class AccountController {
    @Resource
    AccountService accountService;


    @RequestMapping("/register")
    public Result register(User user) {
        Result login = accountService.register(user);
        return login;
    }

    @RequestMapping("/login")
    public Result login (User user){
        Result login = accountService.login(user);
        return  login;
    }

    @RequestMapping("/alterAccount")
    public Result alterAccount (User user){
        if (user!=null){
            return  accountService.alterAccount(user);
        }else {
            return Result.error();
        }
    }
}
