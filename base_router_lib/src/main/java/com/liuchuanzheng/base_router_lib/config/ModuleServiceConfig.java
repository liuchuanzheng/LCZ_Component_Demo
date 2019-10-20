package com.liuchuanzheng.base_router_lib.config;
/**
 * @author: 刘传政
 * @date: 2019-10-20 11:53
 * QQ:1052374416
 * 作用:配置各个模块提供的服务类
 * 注意事项:
 */
public class ModuleServiceConfig {
    private static final String LOGIN_SERVICE_FACTORY = "com.liuchuanzheng.login_lib.service.LoginServiceFactory";

    public static String[] moduleFactorys = {
            LOGIN_SERVICE_FACTORY
    };
}
