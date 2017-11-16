package com.example.mvpframe.mvpframe.api;

import com.example.mvpframe.mvpframe.bean.MainDataEntity;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by libo on 2017/3/30.
 */

public interface ApiService {

    @GET(ApiConstants.Urls.BROADCAST)
    Observable<MainDataEntity> getBroadCast();
}
