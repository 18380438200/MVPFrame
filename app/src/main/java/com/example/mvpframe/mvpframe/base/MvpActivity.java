package com.example.mvpframe.mvpframe.base;

import android.os.Bundle;
import com.example.mvpframe.mvpframe.mvp.presenter.BasePresenter;

/**
 * Created by libo on 2017/3/30.
 */

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity{
    protected P mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mPresenter = createPresenter();
        super.onCreate(savedInstanceState);

    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //页面销毁时取消presenter绑定
        if(mPresenter != null) mPresenter.detachView();
    }
}
