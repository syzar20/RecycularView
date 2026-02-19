package com.example.recycularview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.VH> {

    private final Context context;
    private final List<AppItem> items;

    public AppAdapter(Context context, List<AppItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_chart, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VH h, int position) {
        AppItem item = items.get(position);

        h.tvRank.setText(String.valueOf(item.getRank()));
        h.ivIcon.setImageResource(item.getImageResId());
        h.tvName.setText(item.getName());
        h.tvCategory.setText(item.getCategory());
        h.tvMeta.setText("★ " + item.getRating() + "   •   " + item.getSize());


        h.itemView.setOnClickListener(v ->
                Toast.makeText(context, "Clicked: " + item.getName(), Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        TextView tvRank, tvName, tvCategory, tvMeta;
        ImageView ivIcon;

        public VH(@NonNull View itemView) {
            super(itemView);
            tvRank = itemView.findViewById(R.id.tv_rank);
            ivIcon = itemView.findViewById(R.id.iv_icon);
            tvName = itemView.findViewById(R.id.tv_name);
            tvCategory = itemView.findViewById(R.id.tv_category);
            tvMeta = itemView.findViewById(R.id.tv_meta);
        }
    }
}