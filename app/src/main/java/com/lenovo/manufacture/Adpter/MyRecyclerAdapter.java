package com.lenovo.manufacture.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lenovo.manufacture.R;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import RetrofitBean.WorkerInfoBean;

/**
 * Created by Caleb.F
 * on 2020-03-02
 * at 15:33
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<WorkerInfoBean> mlist;
    private static final int HEADER_VIEW = 1;
    private static final int CONTENT_VIEW = 2;

    public MyRecyclerAdapter(Context context, List<WorkerInfoBean> mlist) {
        mContext = context;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return new MyHeaderView(LayoutInflater.from(mContext).inflate(R.layout.recycler_header, parent
                    , false));
        }
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.recycler_item, parent
                , false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyHeaderView) {
            ((MyHeaderView) holder).mTvMoney.setOnClickListener(v -> {
                Collections.sort(mlist, new Comparator<WorkerInfoBean>() {
                    @Override
                    public int compare(WorkerInfoBean workerInfoBean, WorkerInfoBean t1) {
                        return -(Integer.valueOf(workerInfoBean.getMoney()) - Integer.valueOf(t1.getMoney()));
                    }
                });
                notifyDataSetChanged();
            });
            ((MyHeaderView) holder).mTvType.setOnClickListener(v -> {
                Collator instance = Collator.getInstance(Locale.CHINA);
                Collections.sort(mlist, new Comparator<WorkerInfoBean>() {
                    @Override
                    public int compare(WorkerInfoBean workerInfoBean, WorkerInfoBean t1) {
                        return instance.compare(workerInfoBean.getWorkerType(), t1.getWorkerType());
                    }
                });
                notifyDataSetChanged();
            });
        } else if (holder instanceof MyViewHolder) {
            ((MyViewHolder) holder).mTvNameInfo.setText(mlist.get(position - 1).getName());
            ((MyViewHolder) holder).mTvWorkType.setText(mlist.get(position - 1).getWorkerType());
            ((MyViewHolder) holder).mTvMoney.setText(mlist.get(position - 1).getMoney());
        }
    }


    @Override
    public int getItemCount() {
        return mlist.size() + 1;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTvNameInfo;
        TextView mTvWorkType;
        TextView mTvMoney;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTvNameInfo = itemView.findViewById(R.id.tv_name_info);
            mTvWorkType = itemView.findViewById(R.id.tv_work_type);
            mTvMoney = itemView.findViewById(R.id.tv_money);

        }
    }

    class MyHeaderView extends RecyclerView.ViewHolder {
        TextView mTvType;
        TextView mTvMoney;

        public MyHeaderView(@NonNull View itemView) {
            super(itemView);
            mTvType = itemView.findViewById(R.id.tv_type);
            mTvMoney = itemView.findViewById(R.id.tv_money);

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return HEADER_VIEW;
        } else {
            return CONTENT_VIEW;
        }
    }

    public void setList(List<WorkerInfoBean> list) {
        mlist = list;
        notifyDataSetChanged();
    }

}
