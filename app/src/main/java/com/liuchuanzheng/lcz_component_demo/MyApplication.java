package com.liuchuanzheng.lcz_component_demo;

import android.app.Application;
import android.util.Log;

import com.liuchuanzheng.base_lib.app.BaseLibApplication;
import com.liuchuanzheng.base_lib.app.BaseMainApplication;
import com.liuchuanzheng.base_router_lib.config.ModuleServiceConfig;
import com.liuchuanzheng.base_router_lib.factory.BaseProvideFactory;


/**
 * @author 刘传政
 * @date 2019-10-18 17:24
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
public class MyApplication extends BaseMainApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("liuchuanzheng","111");
    }

}
