package com.yang.adapter;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.yang.R;
import com.yang.entity.AccountItem;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class EditAccountAdapter extends RecyclerView.Adapter<EditAccountAdapter.EditAccountHoler> {

    private static final String TAG = "EditAccountAdapter";
    private final Context mContext;
    private final List<AccountItem> mList;
    private OnEditTextChangeListener mOnEditTextChangeListener;


    public interface OnEditTextChangeListener{
        void onEditTextChangeListener(String text,int position);
    }

    public void setOnEditTextChangeListener(OnEditTextChangeListener onEditTextChangeListener){

        mOnEditTextChangeListener = onEditTextChangeListener;
    }

    public EditAccountAdapter(Context context, List<AccountItem> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public EditAccountHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View inflate = View.inflate(mContext, R.layout.edit_account_item, null);

        return new EditAccountHoler(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull EditAccountHoler holder, int position) {

        AccountItem accountItem = mList.get(position);

        holder.key.setText(accountItem.getKey());
        holder.value.setText(accountItem.getValue());

        holder.value.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(mOnEditTextChangeListener!=null){
                    mOnEditTextChangeListener.onEditTextChangeListener(s.toString(),position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }


    static class EditAccountHoler extends RecyclerView.ViewHolder {

        @BindView(R.id.item_tv_key)
        TextView key;

        @BindView(R.id.item_et_value)
        EditText value;

        EditAccountHoler(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }

    }

}
