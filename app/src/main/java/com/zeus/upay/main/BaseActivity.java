package com.zeus.upay.main;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 10/26/15.
 */
public class BaseActivity extends AppCompatActivity {
    protected FragmentManager fm;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        fm = getSupportFragmentManager();
    }

    protected void showFragment(int resId, Fragment fragment){
        if (fragment != null) {
            if (!fragment.isAdded()) {
                fm.beginTransaction().add(resId, fragment).show(fragment).commit();
            }else {
                fm.beginTransaction().show(fragment).commit();
            }
        }
    }

    protected void hideFragment(Fragment fragment){
        if (fragment!=null && fragment.isAdded()){
            fm.beginTransaction().hide(fragment).commit();
        }
    }
}
