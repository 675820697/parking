package com.ys.account.service;

import com.ys.account.entity.User;
import com.ys.account.utils.Result;

/**
 * @author 汤先生
 */
public interface AccountService {

    /**
     * 注册
     * @param user
     * @return
     */
    Result register (User user ) ;

    /**
     * 登录
     * @param user
     * @return
     */
    Result login (User user);

    /**
     * 修改账户密码
     * @param user
     * @return
     */
    Result alterAccount (User user);
}
