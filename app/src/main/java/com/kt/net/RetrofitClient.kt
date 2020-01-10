package com.kt.net

import android.util.Log
import com.kt.BASE_URL
import com.kt.TAG
import com.steven.movieapp.utils.LiveDataCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {

        val serviceApi: ServiceApi by lazy {
            var retrofitClient = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(OkHttpClient().newBuilder()
                            .addInterceptor(HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message ->
                                Log.i(TAG, message)
                            }).setLevel(HttpLoggingInterceptor.Level.BODY)).build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(LiveDataCallAdapterFactory())
                    .build()

            retrofitClient.create(ServiceApi::class.java)

        }







    }


}