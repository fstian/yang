package com.kt.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.R
import com.kt.model.Account


class AccountKtAdapter constructor(val context: Context, var list: List<Account>) : RecyclerView.Adapter<AccountKtAdapter.KtHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KtHolder {
        val view = View.inflate(context, R.layout.account_item, null)
        return KtHolder(view)

    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: KtHolder, position: Int) {

        val account = list[position]
        holder.dept.text = account.dept
        holder.account.text = account.account

    }


    class KtHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val dept: TextView = itemView.findViewById(R.id.item_dept)
        val account: TextView = itemView.findViewById(R.id.item_account)

    }
}