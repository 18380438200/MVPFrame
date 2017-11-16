package com.example.mvpframe.mvpframe.base;

import android.os.Bundle;
import android.view.View;

import com.example.mvpframe.mvpframe.mvp.presenter.BasePresenter;

/**
 * Created by libo on 2017/3/30.
 */

public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment{
    protected P mvpPresenter;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mvpPresenter = createPresenter();
    }

    protected abstract P createPresenter();


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }
}
