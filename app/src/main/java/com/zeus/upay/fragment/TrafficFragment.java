package com.zeus.upay.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeus.upay.R;
import com.zeus.upay.main.BaseFragment;

/**
 * 冲流量
 */
public class TrafficFragment extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_traffic, container, false);
    }
}
