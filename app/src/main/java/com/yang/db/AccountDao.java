package com.yang.db;


import com.yang.entity.Account;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface AccountDao {


    @Insert
    void insertAll(Account ...account);


    @Query("select * from  account")
    List<Account> queryAll();


    @Query("select * from  account")
    LiveData<List<Account>> queryAll2Livedata();


    @Update()
    void updateByUuid(Account uuid);

}
