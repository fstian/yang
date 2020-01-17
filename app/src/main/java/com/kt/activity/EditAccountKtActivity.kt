package com.kt.activity

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.R
import com.kt.adapter.EditAccountKtAdapter
import com.kt.adapter.OnEditTextChangeListener
import com.kt.model.Account
import com.kt.model.AccountKtItem
import kotlinx.android.synthetic.main.activity_edit_acount.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EditAccountKtActivity : BaseKtActivity() {

    private var editAccountKtAdapter: EditAccountKtAdapter? = null
    var items: MutableList<AccountKtItem> = mutableListOf()


    override fun getLayoutId(): Int = R.layout.activity_edit_acount
    override fun getToolbarMenuId(): Int = 0

    override fun initViews() {
        initRecyclerView()
        initEtToolbar()
        editAccountKtAdapter?.setOnEditTextChangeListener(object : OnEditTextChangeListener {
            override fun onEditTextChangeListener(text: String, position: Int) {
                items[position].value = text
            }
        })


    }

    private fun initRecyclerView() {
        items.add(AccountKtItem("名称 :", ""))
        items.add(AccountKtItem("账号 :", ""))
        items.add(AccountKtItem("密码 :", ""))
        items.add(AccountKtItem("备注 :", ""))

        add_recycler.layoutManager = LinearLayoutManager(this)
        editAccountKtAdapter = EditAccountKtAdapter(this, items)
        add_recycler.adapter = editAccountKtAdapter


    }

    private fun initEtToolbar() {

        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        val toolbarView = View.inflate(this, R.layout.edit_account_toolbar_item, null)
        toolbar?.addView(toolbarView)

        val iv_back = toolbarView.findViewById<ImageView>(R.id.editAccount_toolbar_iv_back)
        val tv_save = toolbarView.findViewById<TextView>(R.id.editAccount_toolbar_tv_save)

        iv_back.setOnClickListener { finish() }

        tv_save.setOnClickListener {
            val dept = items[0].value
            val account = items[1].value
            val pwd = items[2].value
            val des = items[3].value
            val uuid = account+System.currentTimeMillis()
            val accountBean = Account("type", dept, account, pwd, des, uuid)

            val ui=CoroutineScope(Dispatchers.Main)

            ui.launch {
                try {
                    withContext(Dispatchers.IO){
                        applicationViewModel.insert(accountBean)
                    }
                    finish()
                }catch (e:Throwable){
                    toast(""+e.message)
                }

            }


        }

    }


}