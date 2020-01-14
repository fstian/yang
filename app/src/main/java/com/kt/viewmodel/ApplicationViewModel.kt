package com.kt.viewmodel

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kt.TAG
import com.kt.db.AccountDao
import com.kt.db.AppDatabase
import com.kt.model.Account
import com.kt.model.BaseResult
import com.kt.model.User
import com.kt.net.RetrofitClient
import kotlinx.coroutines.*
import java.lang.Exception

class ApplicationViewModel constructor(application: Application) : AndroidViewModel(application) {


    var context: Application = application
    var accountDao: AccountDao

    init {

        accountDao = AppDatabase.getInstance(context).accountDao()

    }


    fun getLoginResult(user: User): LiveData<BaseResult<String>> = RetrofitClient.serviceApi.getLoginResult(user)


    fun getAll(): LiveData<List<Account>> {
        return accountDao.getAll()
    }

    fun test(): AccountDao = accountDao


    fun insert(account: Account) {
        accountDao.insert(account)

    }
}