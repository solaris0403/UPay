package com.zeus.upay.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zeus.upay.R;
import com.zeus.upay.main.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 重置密码界面
 */
public class ResetActivity extends BaseActivity {
    @Bind(R.id.btn_set)
    Button btnSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);
        ButterKnife.bind(this);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //重新返回登录界面
            }
        });
    }
}
