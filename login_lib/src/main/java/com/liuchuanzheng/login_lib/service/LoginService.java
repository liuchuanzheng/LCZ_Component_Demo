package com.liuchuanzheng.login_lib.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.liuchuanzheng.base_lib.router.path.Path;
import com.liuchuanzheng.base_lib.router.service.ILoginService;

// 实现接口
@Route(path = Path.Login.helloService)
public class LoginService implements ILoginService {

    private Context context;

    @Override
    public boolean isLogin() {
        return true;
    }

    @Override
    public String getAccountId() {
        return "123";
    }

    @Override
    public void init(Context context) {

        this.context = context;
    }
}