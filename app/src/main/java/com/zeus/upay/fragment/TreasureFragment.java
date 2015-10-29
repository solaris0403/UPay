package com.zeus.upay.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zeus.upay.R;
import com.zeus.upay.activity.AnalyzeActivity;
import com.zeus.upay.activity.BillActivity;
import com.zeus.upay.activity.FinanceActivity;
import com.zeus.upay.activity.InsuranceActivity;
import com.zeus.upay.activity.InvestActivity;
import com.zeus.upay.activity.StockActivity;
import com.zeus.upay.main.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 财富
 */
public class TreasureFragment extends BaseFragment {
    @Bind(R.id.btn_analyze)
    Button btnAnalyze;
    @Bind(R.id.btn_bill)
    Button btnBill;
    @Bind(R.id.btn_stock)
    Button btnStock;
    @Bind(R.id.btn_finance)
    Button btnFinance;
    @Bind(R.id.btn_insurance)
    Button btnInsurance;
    @Bind(R.id.btn_invest)
    Button btnInvest;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_treasure, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnAnalyze.setOnClickListener(listener);
        btnBill.setOnClickListener(listener);
        btnStock.setOnClickListener(listener);
        btnInsurance.setOnClickListener(listener);
        btnInvest.setOnClickListener(listener);
        btnFinance.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_analyze:
                    intent = new Intent(TreasureFragment.this.getActivity(), AnalyzeActivity.class);
                    break;
                case R.id.btn_bill:
                    intent = new Intent(TreasureFragment.this.getActivity(), BillActivity.class);
                    break;
                case R.id.btn_stock:
                    intent = new Intent(TreasureFragment.this.getActivity(), StockActivity.class);
                    break;
                case R.id.btn_finance:
                    intent = new Intent(TreasureFragment.this.getActivity(), FinanceActivity.class);
                    break;
                case R.id.btn_insurance:
                    intent = new Intent(TreasureFragment.this.getActivity(), InsuranceActivity.class);
                    break;
                case R.id.btn_invest:
                    intent = new Intent(TreasureFragment.this.getActivity(), InvestActivity.class);
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
