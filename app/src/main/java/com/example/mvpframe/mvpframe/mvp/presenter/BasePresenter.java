package com.example.mvpframe.mvpframe.mvp.presenter;

import android.view.View;

import com.example.mvpframe.mvpframe.api.ApiManager;
import com.example.mvpframe.mvpframe.api.ApiService;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;


/**
 * Created by libo on 2017/3/30.
 *
 * MVP控制类接口
 */

public class BasePresenter<V> {
    public V view;
    private CompositeSubscription mCompositeSubscription;
    protected ApiService apiService;

    //将prerenter与view绑定
    public void attachView(V view){
        this.view = view;
        apiService = ApiManager.getApiService();
    }

    public void detachView(){
        this.view = null;
        onUnsubscribe();
    }

    //RXjava统一取消注册，以避免内存泄露
    public void onUnsubscribe(){
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    public void addSubscription(Observable observable, Subscriber subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
    }

}
