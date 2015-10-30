package com.zeus.upay.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

import com.zeus.upay.R;
import com.zeus.upay.fragment.FeesFragment;
import com.zeus.upay.fragment.TrafficFragment;
import com.zeus.upay.main.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 话费、流量
 */
public class TelephoneExpensesActivity extends BaseActivity {
    @Bind(R.id.btn_fees)
    Button btnFees;
    @Bind(R.id.btn_traffic)
    Button btnTraffic;

    private Fragment mFeesFragment, mTrafficFragment;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telephoneexpenses);
        ButterKnife.bind(this);
        btnFees.setOnClickListener(listener);
        btnTraffic.setOnClickListener(listener);
        mFeesFragment = new FeesFragment();
        mTrafficFragment = new TrafficFragment();
        fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragment_container, mFeesFragment).show(mFeesFragment).add(R.id.fragment_container, mTrafficFragment).hide(mTrafficFragment).commit();
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_fees:
                    fm.beginTransaction().show(mFeesFragment).hide(mTrafficFragment).commit();

                    btnFees.setBackgroundColor(Color.RED);
                    btnTraffic.setBackgroundColor(Color.WHITE);
                    break;
                case R.id.btn_traffic:
                    fm.beginTransaction().show(mTrafficFragment).hide(mFeesFragment).commit();

                    btnFees.setBackgroundColor(Color.WHITE);
                    btnTraffic.setBackgroundColor(Color.RED);
                    break;
                default:
                    break;
            }
        }
    };
}
