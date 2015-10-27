package com.zeus.upay.activity.presenter;

import com.zeus.upay.activity.model.IMainModel;
import com.zeus.upay.activity.model.impl.MainModel;
import com.zeus.upay.activity.view.IMainView;

/**
 * 主界面控制器
 */
public class MainPresenter {
    private IMainModel mainModel;
    private IMainView mainView;
    public MainPresenter(){
        this(new MainModel());
    }
    public MainPresenter(IMainModel mainModel){
        this.mainModel = mainModel;
    }

    public IMainView getMainView() {
        return mainView;
    }

    public void setMainView(IMainView mainView) {
        this.mainView = mainView;
    }

    /**
     * 显示选中的tab
     * @param index
     */
    public void showSelectedTab(int index){
        if (mainView!=null){
            mainView.showTab(index);
        }
    }
}
