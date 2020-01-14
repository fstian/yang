package com.kt.activity

import android.content.Intent
import android.text.TextUtils
import android.view.View
import androidx.lifecycle.Observer
import com.R
import com.kt.model.User
import kotlinx.android.synthetic.main.activity_login.*


class LoginKtActivity : BaseKtActivity() {
    override fun initViews() {

        login.setOnClickListener { v: View? ->

            val account = login_et_account.text.toString()
            val pwd = login_et_pwd.text.toString()

            if (TextUtils.isEmpty(account) || TextUtils.isEmpty(pwd)) {
                return@setOnClickListener
            }

            applicationViewModel.getLoginResult(User(account, pwd)).observe(this, Observer {

                if (it.code == 200) {
                    val intent = Intent(this@LoginKtActivity, AccountKtActivity::class.java)
                    startActivity(intent)
                }

            })
        }

    }

    override fun getToolbarMenuId(): Int = R.menu.toolbar_menu

    override fun getLayoutId(): Int {
        return R.layout.activity_login
    }


}
