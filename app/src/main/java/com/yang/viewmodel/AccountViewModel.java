package com.yang.viewmodel;

import android.app.Application;
import android.util.Log;

import com.yang.db.AccountDao;
import com.yang.db.AccountDatsbase;
import com.yang.entity.Account;
import com.yang.utils.ThreadPoolUtils;

import java.util.List;
import java.util.concurrent.Callable;

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
        Callable callable = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                while (true) {
                    try {
                        mAcountDao.insertAll(account);
                        return true;
                    }catch (Exception e){
                        return false;
                    }

                }

            }
        };

    }





    public LiveData<List<Account>> getAccountList(){
        return mAcountDao.queryAll2Livedata();
    }

}
