package com.lenovo.manufacture.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.lenovo.manufacture.Adpter.MyAdapter;
import com.lenovo.manufacture.Adpter.ProductionLine_Exlist_Adapter;
import com.lenovo.manufacture.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import RetrofitBean.ProductionLineBean;
import RetrofitBean.ProductionLineInfoBean;
import RetrofitBean.StageBean;

public class ProductionLineActivity extends BaseActivity {
    ProductionLineInfoBean productionLineInfoBean;
    StageBean stageBean;
    ProductionLine_Exlist_Adapter adapter;
    private ExpandableListView productionlineExlist;
    private List<String> mGroupList = new ArrayList<>();
    private ArrayList<ArrayList<String>> mItemSet = new ArrayList<>();
    private List<String> mList1 = new ArrayList<>();
    private List<String> mList3 = new ArrayList<>();
    private List<String> mList2 = new ArrayList<>();
    private List<String> mList4 = new ArrayList<>();
    private int num = 1;
    private List<StageBean.DataBean> stageBeanList = new ArrayList<>();
    private List<ProductionLineInfoBean.DataBean> productionLineInfoList = new ArrayList<>();
    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (productionLineInfoBean != null && stageBean != null) {
                switch (msg.what) {
                    case 0:
                        stageBeanList.addAll(stageBean.getData());
                        productionLineInfoList.addAll(productionLineInfoBean.getData());
                        fixList(productionLineInfoList);
                        cutList(stageBeanList);
                        break;
                    case 1:
                        for (int i = 0; i < num; i++) {
                            mGroupList.add("第" + i + "组");
                        }
                        break;
                    default:
                        break;
                }
            }
        }

        private int fixList(List<ProductionLineInfoBean.DataBean> datalist) {
            for (ProductionLineInfoBean.DataBean S : datalist
            ) {
                num++;
            }
            handler.sendEmptyMessage(1);
            return num;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void getProductionLine(ProductionLineInfoBean bean) {
        this.productionLineInfoBean = bean;
        //    handler.sendEmptyMessage(0);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void getProductionLine(StageBean bean) {
        this.stageBean = bean;
        handler.sendEmptyMessage(0);
    }

    private void cutList(List<StageBean.DataBean> dataList) {
        int a = 0;
        int temp = dataList.get(0).getNextStageId();
        for (StageBean.DataBean s : dataList
        ) {
            if (s.getNextStageId() - temp == s.getNextStageId()) {
                a++;
            }
            if (a == 0) {
                mList1.add(s.getStageName());

            } else if (a == 1) {
                mList2.add(s.getStageName());

            } else if (a == 2) {
                mList3.add(s.getStageName());
            }
            temp = s.getNextStageId();
        }
        mItemSet.add((ArrayList<String>) mList4);
        mItemSet.add((ArrayList<String>) mList3);
        mItemSet.add((ArrayList<String>) mList2);
        mItemSet.add((ArrayList<String>) mList1);
    }

    private void initView() {
        initToolBar("生产线");
        productionlineExlist = (ExpandableListView) findViewById(R.id.productionline_exlist);
        MyAdapter adapter = new MyAdapter(this, (ArrayList<String>) mGroupList, mItemSet);
        productionlineExlist.setAdapter(adapter);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_production_line;
    }
}