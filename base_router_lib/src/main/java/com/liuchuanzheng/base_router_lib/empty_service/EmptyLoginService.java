package com.liuchuanzheng.base_router_lib.empty_service;

import com.liuchuanzheng.base_router_lib.service.ILoginService;


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
