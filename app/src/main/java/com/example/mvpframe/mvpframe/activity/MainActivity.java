package com.example.mvpframe.mvpframe.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mvpframe.mvpframe.R;
import com.example.mvpframe.mvpframe.base.MvpActivity;
import com.example.mvpframe.mvpframe.bean.MainDataEntity;
import com.example.mvpframe.mvpframe.mvp.presenter.MainPresenter;
import com.example.mvpframe.mvpframe.mvp.view.MainView;

import java.util.List;

public class MainActivity extends MvpActivity<MainPresenter> implements MainView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter.loadData();
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void getDataSuccess(MainDataEntity model) {
        StringBuilder stringBuilder = new StringBuilder();
        List<MainDataEntity.DataBean.CategoriesBean> list = model.getData().getCategories();
        for(int i=0;i<list.size();i++){
            stringBuilder.append(list.get(i).getName() + "  ");
        }
        Toast.makeText(getApplicationContext(),stringBuilder.toString(),Toast.LENGTH_LONG).show();

    }

    @Override
    public void getDataFail(String msg) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
