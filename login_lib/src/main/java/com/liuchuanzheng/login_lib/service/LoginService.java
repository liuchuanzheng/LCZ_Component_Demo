package com.liuchuanzheng.login_lib.service;

import com.liuchuanzheng.base_router_lib.service.ILoginService;

public class LoginService implements ILoginService {
    @Override
    public boolean isLogin() {
        return true;
    }

    @Override
    public String getAccountId() {
        return "123";
    }
}
