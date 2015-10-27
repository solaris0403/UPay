package com.zeus.upay.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zeus.upay.R;
import com.zeus.upay.main.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 验证安全问题界面
 */
public class AuthenticationActivity extends BaseActivity {
    @Bind(R.id.btn_goon)
    Button btnGoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        ButterKnife.bind(this);
        btnGoon.setOnClickListener(listener );
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_goon:
                    Intent intent = new Intent(AuthenticationActivity.this, ResetActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}

