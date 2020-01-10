package com.yang.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.R;
import com.yang.entity.Account;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.AccountHoler> {

    private final Context mContext;
    private final List<Account> mList;

    public AccountAdapter(Context context, List<Account> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public AccountHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View inflate = View.inflate(mContext, R.layout.account_item, null);

        return new AccountHoler(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountHoler holder, int position) {
        Account account = mList.get(position);
        holder.account.setText(account.getAccount());
        holder.dept.setText(account.getDept());

    }

    @Override
    public int getItemCount() {
        return mList==null?0:mList.size();
    }

    public void setListAndNotifyDataSetChanged(List<Account> account) {
        mList.clear();
        mList.addAll(account);
        notifyDataSetChanged();

    }

    static class AccountHoler extends RecyclerView.ViewHolder{

        @BindView(R.id.item_account)
        TextView account;

        @BindView(R.id.item_dept)
        TextView dept;


          AccountHoler(@NonNull View itemView) {
             super(itemView);

             ButterKnife.bind(this,itemView);
         }
     }

}
