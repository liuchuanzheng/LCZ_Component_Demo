package com.liuchuanzheng.base_lib.router.service;

import com.alibaba.android.arouter.facade.template.IProvider;

// 声明接口,其他组件通过接口来调用服务
public interface ILoginService extends IProvider {
    /**
     * 是否已经登录
     *
     * @return
     */
    boolean isLogin();

    /**
     * 获取登录用户的 AccountId
     *
     * @return
     */
    String getAccountId();
}
