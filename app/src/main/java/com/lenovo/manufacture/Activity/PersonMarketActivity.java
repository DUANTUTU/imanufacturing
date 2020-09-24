package com.lenovo.manufacture.Activity;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lenovo.manufacture.Adpter.MyRecyclerAdapter;
import com.lenovo.manufacture.R;

import java.util.ArrayList;
import java.util.List;

import RertofitApi.RetrofitApi;
import RertofitApi.RetrofitUtil;
import RetrofitBean.PersonBean;
import RetrofitBean.WorkerInfoBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Caleb.F
 * on 2020-03-02
 * at 14:29
 */
public class PersonMarketActivity extends BaseActivity {
    private RecyclerView mMyRecycler;
    private MyRecyclerAdapter myRecyclerAdapter;
    private ProgressDialog mProgressDialog;
    private static final String TAG = "PersonMarketActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mProgressDialog = new ProgressDialog(this);
        initView();
        getData();
    }

    private void getData() {
        mProgressDialog.show();
        RetrofitApi retrofitApi = RetrofitUtil.getInstance().create(RetrofitApi.class);
        Call<PersonBean> allPerson = retrofitApi.getAllPerson();
        allPerson.enqueue(new Callback<PersonBean>() {
            @Override
            public void onResponse(Call<PersonBean> call, Response<PersonBean> response) {
                if (response.isSuccessful()) {
                    mProgressDialog.cancel();
                    handlerData(response.body().getData());
                }
            }

            @Override
            public void onFailure(Call<PersonBean> call, Throwable t) {

            }
        });
    }

    private void handlerData(List<PersonBean.DataBean> data) {
        ArrayList<WorkerInfoBean> workerInfoBeans = new ArrayList<>();
        for (PersonBean.DataBean datum : data) {
            workerInfoBeans.add(new WorkerInfoBean(datum.getPeopleName(), datum.getContent()
                    , String.valueOf(datum.getGold())));
        }
        if (myRecyclerAdapter != null) {
            myRecyclerAdapter.setList(workerInfoBeans);
        }
    }

    private void initView() {
        initToolBar("人才市场列表");
        mMyRecycler = findViewById(R.id.my_recycler);
        mMyRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false));
        myRecyclerAdapter = new MyRecyclerAdapter(this, new ArrayList<WorkerInfoBean>());
        mMyRecycler.setAdapter(myRecyclerAdapter);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_person_market;
    }


}
