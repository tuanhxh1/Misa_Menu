package com.example.myapplication1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private List<String> mListItem;
    private Context mContext;

    public ItemAdapter(List<String> listItem, Context context) {
        mListItem = listItem;
        mContext = context;
    }

    public ItemAdapter(List<String> listItem) {
        mListItem = listItem;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item, viewGroup, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.mTxtItem.setText(mListItem.get(i));
        itemViewHolder.mLlLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemViewHolder.mLlLine.setBackgroundColor(ContextCompat.getColor(mContext, R.color.colorAccent));
                if (onItemClickedListener != null) {
                    onItemClickedListener.onItemClick(itemViewHolder.mTxtItem.getText().toString());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListItem.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView mTxtItem;
        private LinearLayout mLlLine;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mTxtItem = itemView.findViewById(R.id.txtItem);
            mLlLine = itemView.findViewById(R.id.line);
        }
    }

    public interface OnItemClickedListener {
        void onItemClick(String itemName);
    }

    private OnItemClickedListener onItemClickedListener;

    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener) {
        this.onItemClickedListener = onItemClickedListener;
    }
}
