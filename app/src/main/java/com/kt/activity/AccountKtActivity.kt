package com.kt.activity

import android.content.Intent
import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.R
import com.kt.adapter.AccountKtAdapter
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.coroutines.*

class AccountKtActivity : BaseKtActivity() {


    override fun initViews() {

        var ui = CoroutineScope(Dispatchers.IO)

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

        applicationViewModel.getAll().observe(this, Observer {
            var size = it.size

            account_recycle.layoutManager = LinearLayoutManager(this)

            account_recycle.adapter = AccountKtAdapter(this, it)


        })


        toolbar?.setOnMenuItemClickListener { item ->

            when (item.itemId) {
                R.id.action_add -> {
                    startActivity(Intent(this, EditAccountKtActivity::class.java))
                }
                R.id.action_search -> {
                }
            }

            return@setOnMenuItemClickListener false

        }


    }

    override fun onStop() {
        super.onStop()

        Log.i(com.kt.TAG, "length_onstop")

    }

    override fun getLayoutId(): Int = R.layout.activity_account

    override fun getToolbarMenuId(): Int = R.menu.toolbar_menu




}



