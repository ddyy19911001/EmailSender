package com.dy.payframwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dy.maillibrary.MailManager;

import yin.deng.normalutils.utils.NoDoubleClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View bt = findViewById(R.id.send_btn);
        bt.setOnClickListener(new NoDoubleClickListener() {
            @Override
            protected void onNoDoubleClick(View v) {
                //每当下单之后便发送一封邮件通知管理员，用户进行付款，
                MailManager mailManager = MailManager.getInstance();
                mailManager.sendMail("测试标题", "邮件内容");
            }
        });
    }
}
