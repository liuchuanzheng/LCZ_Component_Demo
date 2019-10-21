package com.liuchuanzheng.lcz_component_demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.liuchuanzheng.base_lib.router.path.Path;
import com.liuchuanzheng.base_lib.router.service.ILoginService;

public class MainActivity extends AppCompatActivity {
    // 1. (推荐)使用依赖注入的方式发现服务,通过注解标注字段,即可使用，无需主动获取
    // Autowired注解中标注name之后，将会使用byName的方式注入对应的字段，不设置name属性，
    // 会默认使用byType的方式发现服务(当同一接口有多个实现的时候，必须使用byName的方式发现服务)
    @Autowired
    ILoginService loginService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().inject(this);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String accountId = ModuleServiceFactory.getInstance().getLoginService().getAccountId();
//                Toast.makeText(MainActivity.this,accountId, Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, loginService.getAccountId(), Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
                ARouter.getInstance().build(Path.Login.loginActivity).navigation();
            }
        });


    }
}
