package com.liuchuanzheng.base_lib.router.service;

public interface ILoginService {

    /**
     * 是否已经登录
     *
     * @return
     */
    boolean isLogin();

    /**
     * 获取登录用户的 AccountId
     *
     * @return
     */
    String getAccountId();
}
