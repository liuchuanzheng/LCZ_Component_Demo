package com.liuchuanzheng.lcz_component_demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.liuchuanzheng.base_lib.router.factory.ModuleServiceFactory;
import com.liuchuanzheng.base_lib.router.path.Path;

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
