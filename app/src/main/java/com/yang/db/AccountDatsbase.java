package com.yang.db;

import android.content.Context;

import com.yang.entity.Account;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Account.class}, version = 1)
public abstract class AccountDatsbase extends RoomDatabase {

    public abstract AccountDao getAcountDao();

    public static AccountDatsbase  getDb(Context context){

        return Room.databaseBuilder(context,AccountDatsbase.class,"account_database").build();

    }

}
