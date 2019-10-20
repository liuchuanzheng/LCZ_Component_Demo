package com.liuchuanzheng.lcz_component_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.liuchuanzheng.base_router_lib.factory.ModuleServiceFactory;
import com.liuchuanzheng.base_router_lib.path.Path;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String accountId = ModuleServiceFactory.getInstance().getLoginService().getAccountId();
                Toast.makeText(MainActivity.this,accountId,Toast.LENGTH_LONG).show();
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
