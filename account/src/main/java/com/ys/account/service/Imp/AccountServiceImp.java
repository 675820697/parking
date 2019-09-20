package com.ys.account.service.Imp;

import com.ys.account.entity.User;
import com.ys.account.mapper.UserMapper;
import com.ys.account.service.AccountService;
import com.ys.account.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 汤先生
 * 登录店长推荐
 */
@Service
public class AccountServiceImp implements AccountService {
    @Resource
    UserMapper userMapper;
    @Override
    public Result register(User user) {
        String userByPhone = userMapper.findUserByPhone(user.getPhone());
        if (userByPhone!=null&&userByPhone.equals(user.getPhone())){
            return new Result("手机号码已注册",null,400);
        }
             int insert = userMapper.insert(user);
            if (insert>0) {
                return Result.success();
            }else {
               return Result.error();
            }

    }

    @Override
    public Result login(User user) {
        String userByPhone = userMapper.findUserByPhone(user.getPhone());
        if (userByPhone!=null&& userByPhone.equals(user.getPhone())){
            return Result.success();
        }else if (userByPhone==null){
            return new Result("用户不存在",null,400);
        }
        return Result.error();
    }

    @Override
    public Result alterAccount(User user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        if (i>0){
            return  Result.success();
        }
        return Result.error();
    }
}
