package com.kt.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kt.model.Account
import com.kt.model.User


@Dao
interface AccountDao{

    @Query("SELECT * FROM account")
     fun getAll(): LiveData<List<Account>>

    @Insert
     fun insertAll(vararg accounts: Account)

    @Insert
     fun insert(account: Account)


}