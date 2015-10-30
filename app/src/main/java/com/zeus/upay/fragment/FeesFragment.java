package com.zeus.upay.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeus.upay.R;
import com.zeus.upay.main.BaseFragment;

/**
 * 充话费
 */
public class FeesFragment extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fees, container, false);
    }
}
