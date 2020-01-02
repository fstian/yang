package com.yang.net;

import com.yang.entity.BaseRespon;
import com.yang.entity.User;

import androidx.lifecycle.MutableLiveData;

import retrofit2.http.*;

/**
 * Created by YT on 2019.6.27.
 */

public interface CommonService {


    //https://github.com/fstian/KtDemo/blob/master/git.txt

    @GET("fstian/KtDemo/blob/master/git.txt")
    MutableLiveData<String> login(@Query("workid") String userid, @Query("pwd") String pwd, @Query("phoneid") String serial);



    @GET("us_box")
    MutableLiveData<MovieBean> getList(@Query("apikey") String apikey);

    /**
     * 北美票房榜
     * 请求实例 https://api.douban.com/v2/movie/us_box?apikey=0b2bdeda43b5688921839c8ecb20399b
     */


    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("login/")
    MutableLiveData<BaseRespon<String>> login(@Body User user);


}
