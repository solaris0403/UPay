package com.zeus.upay.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.zeus.upay.R;
import com.zeus.upay.activity.LocationActivity;
import com.zeus.upay.main.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 发现
 */
public class DiscoverFragment extends BaseFragment {
    @Bind(R.id.btn_food)
    Button btnFood;
    @Bind(R.id.btn_take_out)
    Button btnTakeOut;
    @Bind(R.id.btn_snack_food)
    Button btnSnackFood;
    @Bind(R.id.btn_fast_food)
    Button btnFastFood;
    @Bind(R.id.btn_overseas)
    Button btnOverseas;
    @Bind(R.id.btn_movie)
    Button btnMovie;
    @Bind(R.id.btn_travel_around)
    Button btnTravelAround;
    @Bind(R.id.btn_ad_top)
    Button btnAdTop;
    @Bind(R.id.btn_ad_left)
    Button btnAdLeft;
    @Bind(R.id.btn_ad_right)
    Button btnAdRight;
    @Bind(R.id.btn_location)
    ImageButton btnLocation;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnLocation.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_location:
                    intent = new Intent(DiscoverFragment.this.getActivity(), LocationActivity.class);
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
