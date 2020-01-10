package com.yang.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.R;
import com.yang.db.AccountDao;
import com.yang.db.AccountDatsbase;
import com.yang.entity.Account;
import com.yang.entity.BaseRespon;
import com.yang.entity.User;
import com.yang.viewmodel.AccountViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author YT
 */
public class LoginActivity extends BaseActivity {

    @BindView(R.id.login_et_account)
    EditText mLoginEtAccount;
    @BindView(R.id.login_et_pwd)
    EditText mLoginEtPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(AccountViewModel.class).getAccountList().observe(this, new Observer<List<Account>>() {
            @Override
            public void onChanged(List<Account> accounts) {
                Log.i(TAG, "onChanged: "+accounts);
            }
        });


        AccountDatsbase db = AccountDatsbase.getDb(getApplicationContext());

        AccountDao acountDao = db.getAcountDao();


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                acountDao.insertAll(new Account("type","dept","account","pwd","des"));
//
//                List<Account> accounts = acountDao.queryAll();
//
//                Log.i(TAG, "run: "+accounts.size());
//                Log.i(TAG, "run: "+accounts.toString());
//            }
//        }).start();


    }

    @Override
    protected void initData() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public int getToolbarMenuId() {
        return R.menu.toolbar_menu;
    }

    public void login(View view) {
        String account = mLoginEtAccount.getText().toString().trim();
        String pwd = mLoginEtPwd.getText().toString().trim();

        if(TextUtils.isEmpty(account)||TextUtils.isEmpty(pwd)){
            Toast.makeText(this,"不能为空",Toast.LENGTH_SHORT).show();
            return;
        }

        mCommonService.login(new User(account,pwd)).observe(this, new Observer<BaseRespon<String>>() {
            @Override
            public void onChanged(BaseRespon<String> stringBaseRespon) {
                Log.i(TAG, "onChanged: "+stringBaseRespon);

            }
        });

    }


}
