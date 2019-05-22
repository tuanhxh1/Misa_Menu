package com.example.misa_cukcuklite_menu.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.misa_cukcuklite_menu.R;
import com.example.misa_cukcuklite_menu.model.ItemFood;

import java.util.List;

public class ItemFoodAdapter extends RecyclerView.Adapter<ItemFoodAdapter.MyViewHolder> {
    private List<ItemFood> mItemFood;
    private Context mContext;

    public ItemFoodAdapter(List<ItemFood> itemFood, Context context) {
        mItemFood = itemFood;
        mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext.getApplicationContext());
        View v = inflater.inflate(R.layout.item_food, viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.imgFood.setImageResource(mItemFood.get(i).getImgFood());
        myViewHolder.tvItemFood.setText(mItemFood.get(i).getTvItemFood());
        myViewHolder.tvPrice.setText(mItemFood.get(i).getTvPrice());
    }

    @Override
    public int getItemCount() {
        return mItemFood.size();
    }

    @Override
    public long getItemId(int position) {
        return mItemFood.get(position).getId();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFood;
        private TextView tvPrice;
        private TextView tvItemFood;
        int id;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imgFood);
            tvPrice  = itemView.findViewById(R.id.tvItemFood);
            tvItemFood = itemView.findViewById(R.id.tvItemFood);
        }
    }
}
