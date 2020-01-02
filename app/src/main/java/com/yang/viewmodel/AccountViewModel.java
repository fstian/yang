package com.yang.viewmodel;

import android.app.Application;

import com.yang.db.AccountDao;
import com.yang.db.AccountDatsbase;
import com.yang.entity.Account;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class AccountViewModel extends AndroidViewModel {


    private final AccountDao mAcountDao;

    public AccountViewModel(@NonNull Application application) {
        super(application);
        mAcountDao = AccountDatsbase.getDb(application).getAcountDao();

    }

    public void insert(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                mAcountDao.insertAll(new Account("type1","dept","account","pwd","des"));
            }
        }).start();
    }


    public LiveData<List<Account>> getAccountList(){
        return mAcountDao.queryAll2Livedata();
    }

}
