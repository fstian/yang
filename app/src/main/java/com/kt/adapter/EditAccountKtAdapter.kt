package com.kt.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.R
import com.kt.model.AccountKtItem

class EditAccountKtAdapter(val context: Context, var list: List<AccountKtItem>) : RecyclerView.Adapter<EditAccountKtAdapter.EditAccountHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EditAccountHolder {

        return EditAccountHolder(View.inflate(context, R.layout.edit_account_item, null))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: EditAccountHolder, position: Int) {
        val item = list[position]

        holder.tv_key.text = item.key


    }


    class EditAccountHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tv_key = itemView.findViewById<TextView>(R.id.item_tv_key)
        val tv_value = itemView.findViewById<TextView>(R.id.item_et_value)



    }
}