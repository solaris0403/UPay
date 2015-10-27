package com.zeus.upay.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.zeus.upay.R;
import com.zeus.upay.main.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 登陆界面
 */
public class LoginActivity extends BaseActivity {
    @Bind(R.id.img_avatar)
    ImageView imgAvatar;
    @Bind(R.id.btn_login)
    Button btnLogin;
    @Bind(R.id.txt_forget)
    TextView txtForget;
    @Bind(R.id.txt_register)
    TextView txtRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        btnLogin.setOnClickListener(listener);
        txtForget.setOnClickListener(listener);
        txtRegister.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_login:
                    intent = new Intent(LoginActivity.this, MainActivity.class);
                    break;
                case R.id.txt_forget:
                    intent = new Intent(LoginActivity.this, ForgetActivity.class);
                    break;
                case R.id.txt_register:
                    intent = new Intent(LoginActivity.this, RegisterActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    };
}
