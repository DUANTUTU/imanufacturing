package com.lenovo.manufacture.Adpter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Caleb.F
 * on 2020-03-04
 * at 10:22
 */
public class MyUserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public MyUserAdapter(Context context) {
    }

    private static final int MY_HEADER_VIEW = 1;
    private static final int MY_ITEM_VIEW = 2;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return MY_HEADER_VIEW;
        }
        return MY_ITEM_VIEW;
    }

    class MyHeaderView extends RecyclerView.ViewHolder {
        public MyHeaderView(@NonNull View itemView) {
            super(itemView);
        }
    }

    class MyItemView extends RecyclerView.ViewHolder {

        public MyItemView(@NonNull View itemView) {
            super(itemView);
        }
    }
}
