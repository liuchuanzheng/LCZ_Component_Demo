package com.liuchuanzheng.login_lib.service;


import com.liuchuanzheng.base_router_lib.factory.BaseProvideFactory;
import com.liuchuanzheng.base_router_lib.factory.ModuleServiceFactory;

/**
 * @author: 刘传政
 * @date: 2019-10-18 17:53
 * QQ:1052374416
 * 作用:生产各个模块的接口服务工厂,避免子模块直接调用其他模块的方法.所有调用都通过此模块.
 * 注意事项:
 */
public class LoginServiceFactory extends BaseProvideFactory {

    public void provide() {
        ModuleServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
