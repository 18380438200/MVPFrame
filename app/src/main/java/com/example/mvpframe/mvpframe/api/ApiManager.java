package com.example.mvpframe.mvpframe.api;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by libo on 2017/3/30.
 */

public class ApiManager {
    private Retrofit retrofit;
    private static final int DEFUALT_TIMEOUT = 5;
    private static ApiService apiService;
    private static ApiManager apiManager;

    private ApiManager(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFUALT_TIMEOUT, TimeUnit.SECONDS);
        OkHttpClient client = builder.build();

        retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstants.Urls.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public static ApiService getApiService(){
        if(apiService == null){
            apiManager = new ApiManager();
        }
        return apiService;
    }

}
