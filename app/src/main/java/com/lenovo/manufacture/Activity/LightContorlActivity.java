package com.lenovo.manufacture.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.lenovo.manufacture.R;

import RertofitApi.RetrofitApi;
import RertofitApi.RetrofitUtil;
import RetrofitBean.LightBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Caleb.F
 * on 2020-03-01
 * at 16:13
 */
public class LightContorlActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "LightContorlActivity";
    private ImageView mImageSnow;
    private ImageView mImageSun;
    private Button mBtnCold;
    private Button mBtnWarm;
    private ImageButton mBtnClose;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_light;
    }

    private void initView() {
        mImageSnow = (ImageView) findViewById(R.id.image_snow);
        mImageSun = (ImageView) findViewById(R.id.image_sun);
        mBtnCold = (Button) findViewById(R.id.btn_cold);
        mBtnCold.setOnClickListener(this);
        mBtnWarm = (Button) findViewById(R.id.btn_warm);
        mBtnWarm.setOnClickListener(this);
        mBtnClose = (ImageButton) findViewById(R.id.btn_close);
        mBtnClose.setOnClickListener(this);
        initToolBar("空调控制");
    }

    private void setWind(String windType) {
        RetrofitApi retrofitApi = RetrofitUtil.getInstance().create(RetrofitApi.class);
        retrofitApi.setWind(1, windType).enqueue(new Callback<LightBean>() {
            @Override
            public void onResponse(Call<LightBean> call, Response<LightBean> response) {
                Log.d(TAG, "onResponse: " + response.toString());
                if (response.isSuccessful()) {
                    initImage();
                    switch (windType) {
                        case "0":
                            break;
                        case "1":
                            mImageSnow.setImageResource(R.mipmap.snow_black);
                            break;
                        case "2":
                            mImageSun.setImageResource(R.mipmap.sun_balck);
                            break;
                    }
                } else {
                    Log.d(TAG, "onResponse: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<LightBean> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.toString());
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cold:
                setWind("1");
                break;
            case R.id.btn_warm:
                setWind("2");
                break;
            case R.id.btn_close:
                setWind("0");
                break;
        }
    }

    private void initImage() {
        mImageSnow.setImageResource(R.mipmap.snow_white);
        mImageSun.setImageResource(R.mipmap.sun_white);
    }
}
