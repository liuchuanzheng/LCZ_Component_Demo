package com.liuchuanzheng.lcz_component_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.liuchuanzheng.base_router_lib.factory.ModuleServiceFactory;

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

    }
}
