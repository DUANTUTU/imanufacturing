package com.lenovo.manufacture.Adpter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.ArrayList;
import java.util.List;

import RetrofitBean.ProductionLineInfoBean;
import RetrofitBean.StageBean;

public class ProductionLine_Exlist_Adapter extends BaseExpandableListAdapter {

    ProductionLineInfoBean productionLineInfoBean;
    StageBean stageBean;

    public ProductionLine_Exlist_Adapter(ProductionLineInfoBean productionLineInfoBean, StageBean stageBean) {
        this.productionLineInfoBean = productionLineInfoBean;
        this.stageBean = stageBean;


        List<ProductionLineInfoBean.DataBean> lst1 = productionLineInfoBean.getData();
        List<StageBean.DataBean> lst2 = stageBean.getData();


        for (ProductionLineInfoBean.DataBean data : lst1) {
            data.stages = new ArrayList<>();

            int startid = data.getStageId();

            boolean isfind = true;
            while (isfind = true) {
                isfind = false;
                for (StageBean.DataBean stage : lst2) {
                    if (stage.getId() == startid) {
                        data.stages.add(startid);
                        startid = stage.getNextStageId();
                        isfind = true;
                    }
                }

            }
        }
    }

    @Override
    public int getGroupCount() {
        return productionLineInfoBean.getData().size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return productionLineInfoBean.getData().get(groupPosition).stages.size();
    }


    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
