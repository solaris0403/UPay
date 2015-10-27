package com.zeus.upay.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

import com.zeus.upay.R;
import com.zeus.upay.activity.presenter.MainPresenter;
import com.zeus.upay.activity.view.IMainView;
import com.zeus.upay.fragment.DiscoverFragment;
import com.zeus.upay.fragment.HomeFragment;
import com.zeus.upay.fragment.MineFragment;
import com.zeus.upay.fragment.TreasureFragment;
import com.zeus.upay.main.BaseActivity;

/**
 * 应用程序主界面
 */
public class MainActivity extends BaseActivity implements IMainView {
    private MainPresenter mainPresenter;
    private FragmentManager fm;
    private int[] btnId = new int[]{R.id.btn_tab_home, R.id.btn_tab_discover, R.id.btn_tab_treasure, R.id.btn_tab_mine};
    private Button[] mBtnTabs;
    private Fragment[] mFragments;
    private int mCurrentIndex = -1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控制器及关联视图
        mainPresenter = new MainPresenter();
        mainPresenter.setMainView(this);
        mBtnTabs = new Button[btnId.length];
        mFragments = new Fragment[btnId.length];
        for (int i = 0; i < btnId.length; i++) {
            mBtnTabs[i] = (Button) findViewById(btnId[i]);
            mBtnTabs[i].setOnClickListener(listener);
        }
        mFragments[0] = new HomeFragment();
        mFragments[1] = new DiscoverFragment();
        mFragments[2] = new TreasureFragment();
        mFragments[3] = new MineFragment();
        fm = getSupportFragmentManager();
        mainPresenter.showSelectedTab(0);
    }

    @Override
    public void showTab(int index) {
        if (mCurrentIndex == index){
            //点的是同一个
            return;
        }
        mBtnTabs[index].setSelected(true);
        if (!mFragments[index].isAdded()) {
            fm.beginTransaction().add(R.id.fragment_container, mFragments[index]).show(mFragments[index]).commit();
        }else{
            fm.beginTransaction().show(mFragments[index]).commit();
        }
        if (mCurrentIndex >= 0) {
            mBtnTabs[mCurrentIndex].setSelected(false);
            fm.beginTransaction().hide(mFragments[mCurrentIndex]).commit();
        }
        mCurrentIndex = index;
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_tab_home:
                    mainPresenter.showSelectedTab(0);
                    break;
                case R.id.btn_tab_discover:
                    mainPresenter.showSelectedTab(1);
                    break;
                case R.id.btn_tab_treasure:
                    mainPresenter.showSelectedTab(2);
                    break;
                case R.id.btn_tab_mine:
                    mainPresenter.showSelectedTab(3);
                    break;
                default:
                    break;
            }
        }
    };
}
