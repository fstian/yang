package com.kt.adapter

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.R
import com.kt.model.AccountKtItem

class EditAccountKtAdapter(val context: Context, var list: List<AccountKtItem>) : RecyclerView.Adapter<EditAccountKtAdapter.EditAccountHolder>() {

    var mOnEditTextChangeListener: OnEditTextChangeListener? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EditAccountHolder {

        return EditAccountHolder(View.inflate(context, R.layout.edit_account_item, null))
    }


    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: EditAccountHolder, position: Int) {

//
//        with(list[position]){
//            holder.let {
//                it.tv_key.text=key
//                it.tv_value.text=value
//            }
//        }

        list[position].run {
            holder.tv_key.text = key
            holder.tv_value.text = value
        }

        holder.tv_value.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable) {
                mOnEditTextChangeListener?.onEditTextChangeListener(s.toString(), position)
            }
        })


    }

    fun setOnEditTextChangeListener(onEditTextChangeListener: OnEditTextChangeListener) {

        this.mOnEditTextChangeListener = onEditTextChangeListener
    }


    class EditAccountHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tv_key = itemView.findViewById<TextView>(R.id.item_tv_key)
        val tv_value = itemView.findViewById<TextView>(R.id.item_et_value)


    }
}