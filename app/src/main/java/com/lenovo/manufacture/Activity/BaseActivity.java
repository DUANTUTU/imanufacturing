package com.lenovo.manufacture.Activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.lenovo.manufacture.R;

import RertofitApi.RetrofitApi;
import RertofitApi.RetrofitUtil;
import me.yokeyword.fragmentation.SupportActivity;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Caleb.F
 * on 2020-03-01
 * at 16:14
 */
public abstract class BaseActivity extends SupportActivity {
    private static final String TAG = "BaseActivity";


    private static final String BASE_URL = "http://onlyone.zicp.vip:11841/";

    /**
     * 初始化 Toolbar
     */
    public void initToolBar(Toolbar toolbar, boolean homeAsUpEnabled, String title) {
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(homeAsUpEnabled);
    }

    public void initToolBar(String title) {
        Toolbar mToolBar = findViewById(R.id.tool_bar);
        TextView mToolbarText = findViewById(R.id.toolbar_text);
        mToolBar.setTitle("");
        mToolbarText.setText(title);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//默认显示箭头
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressedSupport();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressedSupport() {
        //fragment逐个退出
        int count = getSupportFragmentManager().getBackStackEntryCount();
        if (count == 0) {
            super.onBackPressedSupport();
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

    protected abstract int getLayout();
}
