package com.yang.net;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.yang.entity.Account;
import com.yang.viewmodel.AccountViewModel;

import java.util.List;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class MainJetpackActivity extends FragmentActivity {

    private String TAG="MainJetpackActivity";
    private MutableLiveData<MovieBean> login;
    private CommonService commonService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        commonService = RetrofitManager.getRetrofitInstance().create(CommonService.class);
//       commonService.getList("0b2bdeda43b5688921839c8ecb20399b").observe(this,observer);


       


    }

    Observer<MovieBean> observer = new Observer<MovieBean>() {
        @Override
        public void onChanged(MovieBean movieBean) {
            Log.i(TAG, "onChanged: " + movieBean);
        }
    };

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart: ");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    public void click(View view) {
//        commonService.getList("0b2bdeda43b5688921839c8ecb20399b").observe(this,observer);

//        commonService.login(new User("yang","123")).observe(this, new Observer<BaseRespon<String>>() {
//            @Override
//            public void onChanged(BaseRespon<String> stringBaseRespon) {
//
//                Log.i(TAG, "onChanged: "+stringBaseRespon);
//            }
//        });
    }
}



