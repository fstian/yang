package com.yang.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.R;
import com.yang.adapter.EditAccountAdapter;
import com.yang.entity.Account;
import com.yang.entity.AccountItem;
import com.yang.viewmodel.AccountViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

public class EditAccountActivity extends BaseActivity {

    @BindView(R.id.add_recycler)
    RecyclerView mRecyclerView;
    private ArrayList<AccountItem> mItems;
    private EditAccountAdapter mEditAccountAdapter;
    private AccountViewModel mAccountViewModel;


    boolean isModify;

    @Override
    protected void initData() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_edit_acount;
    }

    @Override
    public int getToolbarMenuId() {
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolbar();
        initRecyclerView();
        mAccountViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(AccountViewModel.class);


    }

    @Override
    protected void onResume() {
        super.onResume();

         mAccountViewModel.getAccountList().observe(this, new Observer<List<Account>>() {
            @Override
            public void onChanged(List<Account> accounts) {
                Log.i(TAG, "onChanged: "+accounts);
            }
        });



    }

    private void initToolbar() {

        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        View toolbarView = View.inflate(this, R.layout.edit_account_toolbar_item, null);
        mToolbar.addView(toolbarView);

        ImageView iv_back = (ImageView) toolbarView.findViewById(R.id.editAccount_toolbar_iv_back);

        TextView tv_save = (TextView) toolbarView.findViewById(R.id.editAccount_toolbar_tv_save);


        iv_back.setOnClickListener(onBackClickListener);

        tv_save.setOnClickListener(onSaveClickListener);


    }

    private void initRecyclerView() {

        mItems = new ArrayList<>();

        mItems.add(new AccountItem("名称 :", ""));
        mItems.add(new AccountItem("账号 :", ""));
        mItems.add(new AccountItem("密码 :", ""));
        mItems.add(new AccountItem("备注 :", ""));

        mEditAccountAdapter = new EditAccountAdapter(this, mItems);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mEditAccountAdapter);

        mEditAccountAdapter.setOnEditTextChangeListener(mOnEditTextChangeListener);

    }


    View.OnClickListener onBackClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i(TAG, "onClick: " + "onback");

        }
    };

    View.OnClickListener onSaveClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String dept = mItems.get(0).getValue();
            String account = mItems.get(1).getValue();
            String pwd = mItems.get(2).getValue();
            String des = mItems.get(3).getValue();

            if (TextUtils.isEmpty(account)) {
                Toast.makeText(EditAccountActivity.this, "账号不能为空", Toast.LENGTH_SHORT).show();
                return;
            }

            String uuid=System.currentTimeMillis()+account;

            mAccountViewModel.insert(new Account("type", dept, account, pwd, des,uuid));
        }
    };

    EditAccountAdapter.OnEditTextChangeListener mOnEditTextChangeListener = new EditAccountAdapter.OnEditTextChangeListener() {
        @Override
        public void onEditTextChangeListener(String text, int position) {
            AccountItem accountItem = mItems.get(position);
            accountItem.setValue(text);
        }
    };


}
