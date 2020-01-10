package com.kt.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kt.db.AccountDao
import com.kt.db.AppDatabase
import com.kt.model.Account
import com.kt.model.BaseResult
import com.kt.model.User
import com.kt.net.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CommonViewModel(context: Context) : ViewModel() {

    var context: Context
    var accountDao: AccountDao

    init {
        this.context = context
        accountDao = AppDatabase.getInstance(context).accountDao()

    }


    fun getLoginResult(user: User): LiveData<BaseResult<String>> = RetrofitClient.serviceApi.getLoginResult(user)


    fun getAll(): LiveData<List<Account>> {
        return accountDao.getAll()
    }


    fun inserAll( users: User){

        var job = GlobalScope.launch(Dispatchers.IO) {
            accountDao.insertAll(users)
        }


    }
}