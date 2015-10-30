package com.zeus.upay.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zeus.upay.R;
import com.zeus.upay.activity.CreditCardActivity;
import com.zeus.upay.activity.LifeExpensesActivity;
import com.zeus.upay.activity.OneCardActivity;
import com.zeus.upay.activity.PaymentCodeActivity;
import com.zeus.upay.activity.RichScanActivity;
import com.zeus.upay.activity.TelephoneExpensesActivity;
import com.zeus.upay.activity.SelectContactActivity;
import com.zeus.upay.activity.TransportationActivity;
import com.zeus.upay.activity.WithdrawalActivity;
import com.zeus.upay.main.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 首页
 */
public class HomeFragment extends BaseFragment {
    @Bind(R.id.btn_rich_scan)
    Button btnRichScan;
    @Bind(R.id.btn_payment_code)
    Button btnPaymentCode;
    @Bind(R.id.btn_transfer)
    Button btnTransfer;
    @Bind(R.id.btn_telephone_expenses)
    Button btnTelephoneExpenses;
    @Bind(R.id.btn_credit_card)
    Button btnCreditCard;
    @Bind(R.id.btn_life_expenses)
    Button btnLifeExpenses;
    @Bind(R.id.btn_withdrawal)
    Button btnWithdrawal;
    @Bind(R.id.btn_transportation)
    Button btnTransportation;
    @Bind(R.id.btn_one_card)
    Button btnOneCard;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnRichScan.setOnClickListener(listener);
        btnPaymentCode.setOnClickListener(listener);
        btnTransfer.setOnClickListener(listener);
        btnTelephoneExpenses.setOnClickListener(listener);
        btnCreditCard.setOnClickListener(listener);
        btnLifeExpenses.setOnClickListener(listener);
        btnWithdrawal.setOnClickListener(listener);
        btnTransportation.setOnClickListener(listener);
        btnOneCard.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_rich_scan:
                    intent = new Intent(HomeFragment.this.getActivity(), RichScanActivity.class);
                    break;
                case R.id.btn_payment_code:
                    intent = new Intent(HomeFragment.this.getActivity(), PaymentCodeActivity.class);
                    break;
                case R.id.btn_transfer:
                    intent = new Intent(HomeFragment.this.getActivity(), SelectContactActivity.class);
                    break;
                case R.id.btn_telephone_expenses:
                    intent = new Intent(HomeFragment.this.getActivity(), TelephoneExpensesActivity.class);
                    break;
                case R.id.btn_credit_card:
                    intent = new Intent(HomeFragment.this.getActivity(), CreditCardActivity.class);
                    break;
                case R.id.btn_life_expenses:
                    intent = new Intent(HomeFragment.this.getActivity(), LifeExpensesActivity.class);
                    break;
                case R.id.btn_withdrawal:
                    intent = new Intent(HomeFragment.this.getActivity(), WithdrawalActivity.class);
                    break;
                case R.id.btn_transportation:
                    intent = new Intent(HomeFragment.this.getActivity(), TransportationActivity.class);
                    break;
                case R.id.btn_one_card:
                    intent = new Intent(HomeFragment.this.getActivity(), OneCardActivity.class);
                    break;
                default:
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
