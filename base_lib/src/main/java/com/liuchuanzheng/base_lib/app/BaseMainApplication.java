package com.liuchuanzheng.base_lib.app;

import android.app.Application;
import android.util.Log;

import com.liuchuanzheng.base_router_lib.config.ModuleServiceConfig;
import com.liuchuanzheng.base_router_lib.factory.BaseProvideFactory;

/**
 * @author: 刘传政
 * @date: 2019-10-20 11:47
 * QQ:1052374416
 * 作用:壳工程也就是主工程的基类.定义了一些base模块希望主工程实现的必要方法
 * 注意事项:
 */
public  class BaseMainApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleService();
    }

    /**
     * 初始化各个模块提供的服务
     */
    public  void initModuleService(){
        for (String factory : ModuleServiceConfig.moduleFactorys) {
            Log.i("liuchuanzheng",factory);
            try {
                Class clazz = Class.forName(factory);
                BaseProvideFactory baseProvideFactory = (BaseProvideFactory) clazz.newInstance();
                baseProvideFactory.provide();
            } catch (Exception e) {
                Log.i("liuchuanzheng","子模块初始化失败"+factory);
                Log.i("liuchuanzheng",e.toString());
                e.printStackTrace();
            }
        }
    }
}
