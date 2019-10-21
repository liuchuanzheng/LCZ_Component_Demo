package com.liuchuanzheng.base_lib.router.empty_service;

import com.liuchuanzheng.base_lib.router.service.ILoginService;


public class EmptyLoginService implements ILoginService {
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return "00000";
    }

}
