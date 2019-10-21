package com.liuchuanzheng.lcz_component_demo;

import com.alibaba.android.arouter.launcher.ARouter;
import com.liuchuanzheng.base_lib.app.BaseMainApplication;


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
        if (isDebug()) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }

}
