package com.zeus.upay.activity;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.zeus.upay.R;
import com.zeus.upay.main.BaseActivity;

/**
 * Created by user on 10/29/15.
 */
public class OneCardActivity extends BaseActivity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_onecard);
    }
}
