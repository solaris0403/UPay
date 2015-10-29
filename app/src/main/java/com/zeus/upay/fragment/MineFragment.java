package com.zeus.upay.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.zeus.upay.R;
import com.zeus.upay.activity.CardActivity;
import com.zeus.upay.activity.CertificateActivity;
import com.zeus.upay.activity.EarningsActivity;
import com.zeus.upay.activity.FavoritesActivity;
import com.zeus.upay.activity.InvestmentActivity;
import com.zeus.upay.activity.PersonalActivity;
import com.zeus.upay.activity.ServiceActivity;
import com.zeus.upay.activity.SettingsActivity;
import com.zeus.upay.main.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 我的
 */
public class MineFragment extends BaseFragment {
    @Bind(R.id.lyt_personal)
    LinearLayout lytPersonal;
    @Bind(R.id.btn_card)
    Button btnCard;
    @Bind(R.id.btn_certificate)
    Button btnCertificate;
    @Bind(R.id.btn_earnings)
    Button btnEarnings;
    @Bind(R.id.btn_investment)
    Button btnInvestment;
    @Bind(R.id.btn_favorites)
    Button btnFavorites;
    @Bind(R.id.btn_service)
    Button btnService;
    @Bind(R.id.btn_settings)
    ImageButton btnSettings;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lytPersonal.setOnClickListener(listener);
        btnCard.setOnClickListener(listener);
        btnCertificate.setOnClickListener(listener);
        btnEarnings.setOnClickListener(listener);
        btnInvestment.setOnClickListener(listener);
        btnFavorites.setOnClickListener(listener);
        btnService.setOnClickListener(listener);
        btnSettings.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_settings:
                    intent = new Intent(MineFragment.this.getActivity(), SettingsActivity.class);
                    break;
                case R.id.lyt_personal:
                    intent = new Intent(MineFragment.this.getActivity(), PersonalActivity.class);
                    break;
                case R.id.btn_card:
                    intent = new Intent(MineFragment.this.getActivity(), CardActivity.class);
                    break;
                case R.id.btn_certificate:
                    intent = new Intent(MineFragment.this.getActivity(), CertificateActivity.class);
                    break;
                case R.id.btn_earnings:
                    intent = new Intent(MineFragment.this.getActivity(), EarningsActivity.class);
                    break;
                case R.id.btn_investment:
                    intent = new Intent(MineFragment.this.getActivity(), InvestmentActivity.class);
                    break;
                case R.id.btn_favorites:
                    intent = new Intent(MineFragment.this.getActivity(), FavoritesActivity.class);
                    break;
                case R.id.btn_service:
                    intent = new Intent(MineFragment.this.getActivity(), ServiceActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
