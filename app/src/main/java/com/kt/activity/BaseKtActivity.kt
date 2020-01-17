package com.kt.activity

import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.R
import com.kt.viewmodel.ApplicationViewModel

abstract class BaseKtActivity : AppCompatActivity() {

    var toolbar: Toolbar? = null;

    val applicationViewModel : ApplicationViewModel by lazy {
        ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(ApplicationViewModel::class.java)

//        ViewModelProviders.of(this).get(ApplicationViewModel::class.java)


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        toolbar = findViewById<Toolbar>(R.id.account_tool)

        initToolbar()

        initViews()
    }

    abstract fun initViews()

    private fun initToolbar() {
        setSupportActionBar(toolbar)
        if(getToolbarMenuId()!=0){
            toolbar!!.inflateMenu(getToolbarMenuId())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        if(getToolbarMenuId()!=0){
            menuInflater.inflate(getToolbarMenuId(),menu)
            return true
        }

        return super.onCreateOptionsMenu(menu)
    }


    abstract fun getLayoutId(): Int


    abstract fun getToolbarMenuId(): Int


    fun toast(toast: String){

        Toast.makeText(this,toast,Toast.LENGTH_SHORT).show()
    }

}