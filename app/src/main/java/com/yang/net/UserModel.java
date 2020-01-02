package com.yang.net;

import com.yang.entity.User;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserModel extends ViewModel {


    MutableLiveData<User> login=new MutableLiveData<>();



    public MutableLiveData<MovieBean> movieBeanMutableLiveData;

    public void getMovieList(String key){
        MutableLiveData<MovieBean> list = RetrofitManager.getRetrofitInstance().create(CommonService.class).getList(key);
    }




}
