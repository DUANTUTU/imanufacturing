package com.lenovo.manufacture.Util;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import RertofitApi.RetrofitApi;
import RertofitApi.RetrofitUtil;
import RetrofitBean.CarBean;
import RetrofitBean.CarInfoBean;
import RetrofitBean.InformationBean;
import RetrofitBean.PLStepBean;
import RetrofitBean.PartBean;
import RetrofitBean.PassRateBean;
import RetrofitBean.PeopleBean;
import RetrofitBean.ProductionLineBean;
import RetrofitBean.ProductionLineInfoBean;
import RetrofitBean.StageBean;
import RetrofitBean.SuppierBean;
import RetrofitBean.SuppierListBean;
import RetrofitBean.plStepCostBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Share {
    private static Share instance;
    public RetrofitApi retrofitApi;
    public SharedPreferences sp;
    public SharedPreferences.Editor ed;
    public Gson gson;

    public static Share getInstance() {
        if (instance == null)
            instance = new Share();
        return instance;
    }

    private Share() {
        retrofitApi = RetrofitUtil.getInstance().create(RetrofitApi.class);
        sp = InitApp.instance.getSharedPreferences("app", Context.MODE_PRIVATE);
        ed = sp.edit();
        gson = new Gson();
    }

    public void initData() {
        retrofitApi.getCar().enqueue(new Callback<CarBean>() {
            @Override
            public void onResponse(Call<CarBean> call, Response<CarBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("car", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<CarBean> call, Throwable t) {
                String res = sp.getString("car", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, CarBean.class));
            }
        });

        retrofitApi.getCarInfo().enqueue(new Callback<CarInfoBean>() {
            @Override
            public void onResponse(Call<CarInfoBean> call, Response<CarInfoBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("carinfo", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<CarInfoBean> call, Throwable t) {
                String res = sp.getString("carinfo", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, CarInfoBean.class));
            }
        });

        retrofitApi.getInformation().enqueue(new Callback<InformationBean>() {
            @Override
            public void onResponse(Call<InformationBean> call, Response<InformationBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("Information", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<InformationBean> call, Throwable t) {
                String res = sp.getString("Information", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, InformationBean.class));

            }
        });

        retrofitApi.getPart().enqueue(new Callback<PartBean>() {
            @Override
            public void onResponse(Call<PartBean> call, Response<PartBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("Part", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<PartBean> call, Throwable t) {
                String res = sp.getString("Part", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, PartBean.class));
            }
        });

        retrofitApi.getPassRate().enqueue(new Callback<PassRateBean>() {
            @Override
            public void onResponse(Call<PassRateBean> call, Response<PassRateBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("PassRate", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<PassRateBean> call, Throwable t) {
                String res = sp.getString("PassRate", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, PassRateBean.class));
            }
        });

        retrofitApi.getPLStep().enqueue(new Callback<PLStepBean>() {
            @Override
            public void onResponse(Call<PLStepBean> call, Response<PLStepBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("PLStep", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<PLStepBean> call, Throwable t) {
                String res = sp.getString("PLStep", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, PLStepBean.class));
            }
        });

        retrofitApi.getplStepCost().enqueue(new Callback<plStepCostBean>() {
            @Override
            public void onResponse(Call<plStepCostBean> call, Response<plStepCostBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("plStepCost", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<plStepCostBean> call, Throwable t) {
                String res = sp.getString("plStepCost", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, plStepCostBean.class));
            }
        });

        retrofitApi.getProductionLine().enqueue(new Callback<ProductionLineBean>() {
            @Override
            public void onResponse(Call<ProductionLineBean> call, Response<ProductionLineBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("ProductionLine", gson.toJson(response.body())).commit();

            }

            @Override
            public void onFailure(Call<ProductionLineBean> call, Throwable t) {
                String res = sp.getString("ProductionLine", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, ProductionLineBean.class));
            }
        });

        retrofitApi.getProductionLineInfo().enqueue(new Callback<ProductionLineInfoBean>() {
            @Override
            public void onResponse(Call<ProductionLineInfoBean> call, Response<ProductionLineInfoBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("ProductionLineInfo", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<ProductionLineInfoBean> call, Throwable t) {
                String res = sp.getString("ProductionLineInfo", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, ProductionLineInfoBean.class));
            }
        });

        retrofitApi.getStage().enqueue((new Callback<StageBean>() {
            @Override
            public void onResponse(Call<StageBean> call, Response<StageBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("Stage", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<StageBean> call, Throwable t) {
                String res = sp.getString("Stage", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, StageBean.class));
            }
        }));

        retrofitApi.getPeople().enqueue(new Callback<PeopleBean>() {
            @Override
            public void onResponse(Call<PeopleBean> call, Response<PeopleBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("People", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<PeopleBean> call, Throwable t) {
                String res = sp.getString("People", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, PeopleBean.class));
            }
        });

        retrofitApi.getSuppier().enqueue(new Callback<SuppierBean>() {
            @Override
            public void onResponse(Call<SuppierBean> call, Response<SuppierBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("Suppier", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<SuppierBean> call, Throwable t) {
                String res = sp.getString("Suppier", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, SuppierBean.class));
            }
        });

        retrofitApi.getSuppierList().enqueue(new Callback<SuppierListBean>() {
            @Override
            public void onResponse(Call<SuppierListBean> call, Response<SuppierListBean> response) {
                EventBus.getDefault().postSticky(response.body());
                ed.putString("SuppierList", gson.toJson(response.body()));
                ed.commit();
            }

            @Override
            public void onFailure(Call<SuppierListBean> call, Throwable t) {
                String res = sp.getString("SuppierList", null);
                if (res != null)
                    EventBus.getDefault().postSticky(gson.fromJson(res, SuppierListBean.class));
            }
        });


    }


}
