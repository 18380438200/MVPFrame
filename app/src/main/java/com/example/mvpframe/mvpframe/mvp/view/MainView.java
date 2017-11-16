package com.example.mvpframe.mvpframe.mvp.view;


import com.example.mvpframe.mvpframe.bean.MainDataEntity;

/**
 * Created by libo on 2017/3/30.
 */

public interface MainView extends BaseView{
    void getDataSuccess(MainDataEntity model);

    void getDataFail(String msg);
}
