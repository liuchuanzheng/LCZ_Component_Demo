package com.liuchuanzheng.base_router_lib.factory;


import com.liuchuanzheng.base_router_lib.empty_service.EmptyLoginService;
import com.liuchuanzheng.base_router_lib.service.ILoginService;

/**
 * @author: 刘传政
 * @date: 2019-10-18 17:53
 * QQ:1052374416
 * 作用:生产各个模块的接口服务工厂,避免子模块直接调用其他模块的方法.所有调用都通过此模块.
 * 注意事项:
 */
public abstract class BaseProvideFactory {
    /**
     * 注册本模块到base模块,以便其他模块使用
     */
    public abstract void provide();
}
