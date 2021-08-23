package com.example.wishlist;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context context;
    private List<item> itemsList;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView itemNameView;
        private TextView itemPriceView;
        private TextView itemurlView;

        public ViewHolder (View v) {
            super(v);
            v.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Activity activity = (Activity) context;


        }
    }

    public RecyclerAdapter(List<item> itemsList) {this.itemsList = itemsList;}

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        item thisItem = itemsList.get(position);
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}
