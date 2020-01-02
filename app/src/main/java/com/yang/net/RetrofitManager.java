package com.yang.net;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by YT on 2019.6.28.
 */

public class RetrofitManager {

    public static Retrofit sRetrofit;

    public static Retrofit getRetrofitInstance() {
        if (sRetrofit == null) {
            return getRerofit();
        }
        return sRetrofit;

    }


    private static Retrofit getRerofit() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(5, TimeUnit.SECONDS);
        builder.readTimeout(10, TimeUnit.SECONDS);
        builder.writeTimeout(10, TimeUnit.SECONDS);
        builder.retryOnConnectionFailure(true);
        builder.addInterceptor(loggingInterceptor);
        OkHttpClient client = builder.build();


        Retrofit retrofit = new Retrofit.Builder()
//                .addConverterFactory(FastjsonConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                .baseUrl("http://172.16.1.84:8080/")
                .client(client).build();
        return retrofit;
    }


}

