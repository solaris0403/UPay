package com.zeus.upay.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.zeus.upay.R;
import com.zeus.upay.app.AppConfig;
import com.zeus.upay.main.BaseActivity;

/**
 * Launch activity
 */
public class LaunchActivity extends BaseActivity {
    private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        mHandler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                if (1 == msg.what){
                    Intent intent = new Intent(LaunchActivity.this, LoginActivity.class);
                    startActivity(intent);
                    LaunchActivity.this.finish();
                }
            }
        };
        mHandler.sendEmptyMessageDelayed(1, AppConfig.LAUNCH_TIME);
    }

    @Override
    protected void onDestroy() {
        mHandler = null;
        super.onDestroy();
    }

    /**
     * weather logined
     * @return
     */
    private boolean isLogined(){
        return false;
    }

    /**
     * weather locked
     * @return
     */
    private boolean isHasLock(){
        return  false;
    }
}
