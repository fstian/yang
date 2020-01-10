package com.yang.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.LruCache;


import com.R;
import com.yang.adapter.AccountAdapter;
import com.yang.entity.Account;
import com.yang.viewmodel.AccountViewModel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import kotlinx.coroutines.GlobalScope;

public class AccountActivity extends BaseActivity {


    @BindView(R.id.account_recycle)
    RecyclerView mRecyclerView;

    private AccountViewModel mAccountViewModel;
    private ArrayList<Account> mAccounts;
    private AccountAdapter mAccountAdapter;


    @Override
    public int getToolbarMenuId() {
        return R.menu.toolbar_menu;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_account;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mToolbar.setOnMenuItemClickListener(mOnMenuItemClickListener);
        mAccountViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(AccountViewModel.class);


    }


    @Override
    protected void onResume() {
        super.onResume();
        mAccountViewModel.getAccountList().observe(this, mAccountObserver);

    }

    @Override
    protected void initData() {
        initRecyclerView();

    }

    private void initRecyclerView() {

        mAccounts = new ArrayList<>();

        mAccountAdapter = new AccountAdapter(this, mAccounts);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAccountAdapter);

    }


    private Observer<List<Account>> mAccountObserver = new Observer<List<Account>>() {
        @Override
        public void onChanged(List<Account> account) {

            Log.i(TAG, "onChanged: " + account);
            mAccountAdapter.setListAndNotifyDataSetChanged(account);

        }
    };

    private Toolbar.OnMenuItemClickListener mOnMenuItemClickListener = item -> {
        switch (item.getItemId()) {
            case R.id.action_add:
                startActivity(new Intent(AccountActivity.this,EditAccountActivity.class));
                break;
            case R.id.action_search:
                break;
            default:
        }
        return false;
    };


}
