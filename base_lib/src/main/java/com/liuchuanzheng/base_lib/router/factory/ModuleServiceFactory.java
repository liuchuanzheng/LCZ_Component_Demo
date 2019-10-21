package com.liuchuanzheng.base_lib.router.factory;


import com.liuchuanzheng.base_lib.router.empty_service.EmptyLoginService;
import com.liuchuanzheng.base_lib.router.service.ILoginService;

/**
 * @author: 刘传政
 * @date: 2019-10-18 17:53
 * QQ:1052374416
 * 作用:生产各个模块的接口服务工厂,避免子模块直接调用其他模块的方法.所有调用都通过此模块.
 * 注意事项:
 */
public class ModuleServiceFactory {
    /**
     * 登录模块的接口服务类
     */
    private ILoginService loginService;

    /**
     * 禁止外部创建 ModuleServiceFactory 对象
     */
    private ModuleServiceFactory() {
    }

    /**
     * 通过静态内部类方式实现 ModuleServiceFactory 的单例
     */
    public static ModuleServiceFactory getInstance() {
        return Inner.serviceFactory;
    }

    private static class Inner {
        private static ModuleServiceFactory serviceFactory = new ModuleServiceFactory();
    }

    /**
     * 接收 Login 组件实现的 Service 实例
     */
    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * 返回 Login 组件的 Service 实例
     */
    public ILoginService getLoginService() {
        if (loginService == null) {
            loginService = new EmptyLoginService();
        }
        return loginService;
    }
}
