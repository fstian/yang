package com.yang.viewmodel;

import android.app.Application;
import android.util.Log;

import com.yang.db.AccountDao;
import com.yang.db.AccountDatsbase;
import com.yang.entity.Account;
import com.yang.utils.ThreadPoolUtils;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class AccountViewModel extends AndroidViewModel {


    private final AccountDao mAcountDao;

    public AccountViewModel(@NonNull Application application) {
        super(application);
        mAcountDao = AccountDatsbase.getDb(application).getAcountDao();
    }

    public void insert(Account account){
        ThreadPoolUtils.getInstance().execute(new Runnable() {
            @Override
            public void run() {
                mAcountDao.insertAll(account);
            }
        });

    }


    public LiveData<List<Account>> getAccountList(){
        return mAcountDao.queryAll2Livedata();
    }

}
