package com.yang.activity;

import android.os.Bundle;
import android.view.Menu;

import com.R;
import com.yang.net.CommonService;
import com.yang.net.RetrofitManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    public final String TAG = this.getClass().getSimpleName();

    public CommonService mCommonService;

    @BindView(R.id.account_tool)
    Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());

        ButterKnife.bind(this);

        initToolBar(getToolbarMenuId());

        mCommonService = RetrofitManager.getRetrofitInstance().create(CommonService.class);

        initData();

    }

    protected abstract void initData();

    private void initToolBar(int getToolbarMenuId) {
        setSupportActionBar(mToolbar);
        if(getToolbarMenuId!=0){
            mToolbar.inflateMenu(getToolbarMenuId);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if(getToolbarMenuId()!=0){
            getMenuInflater().inflate(getToolbarMenuId(),menu);
        }
        return true;
    }

    public abstract int getLayoutId();

    public abstract int getToolbarMenuId();
}
