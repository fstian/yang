package com.kt.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.R
import kotlinx.coroutines.*
import okhttp3.Dispatcher
import kotlin.coroutines.CoroutineContext

class AccountKtActivity : BaseKtActivity() {


    override fun initViews() {

        var ui = CoroutineScope(Dispatchers.Main)

        ui.launch {
            Log.i(com.kt.TAG, "1" + Thread.currentThread().toString())

            val task1 = async(Dispatchers.IO) {
                Log.i(com.kt.TAG, "2" + Thread.currentThread().toString())
                delay(1 * 1000)
                Log.i(com.kt.TAG, "6" + Thread.currentThread().toString())
            }

            val task2 = async(Dispatchers.IO) {
                Log.i(com.kt.TAG, "3" + Thread.currentThread().toString())
                delay(5 * 1000)
                Log.i(com.kt.TAG, "7" + Thread.currentThread().toString())
            }
            Log.i(com.kt.TAG, "4" + Thread.currentThread().toString() + "task1" + task1 + "     " + task2)
            Log.i(com.kt.TAG, "5" + "task1" + task1.await() + "     " + task2.await())



        }


    }

    override fun getLayoutId(): Int = R.layout.activity_account

    override fun getToolbarMenuId(): Int = R.menu.toolbar_menu


    fun test() {


    }


}
