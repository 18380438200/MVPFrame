package com.example.mvpframe.mvpframe.mvp.presenter;

import com.example.mvpframe.mvpframe.api.ApiCallBack;
import com.example.mvpframe.mvpframe.bean.MainDataEntity;
import com.example.mvpframe.mvpframe.mvp.view.MainView;

/**
 * Created by libo on 2017/3/30.
 */

public class MainPresenter extends BasePresenter<MainView>{

    public MainPresenter(MainView view){
        attachView(view);
    }

    public void loadData(){
        view.showLoading();
        addSubscription(apiService.getBroadCast(), new ApiCallBack<MainDataEntity>() {

            @Override
            public void onSuccess(MainDataEntity model) {
                view.hideLoading();
                view.getDataSuccess(model);
            }

            @Override
            public void onFailure(String msg) {
                view.getDataFail(msg);
            }

            @Override
            public void onFinish() {
                view.hideLoading();
            }
        });
    }

}
