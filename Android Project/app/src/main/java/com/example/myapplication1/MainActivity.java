package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ItemAdapter mItemAdapter;
    private List<String> mListItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rcvItem);

        mRecyclerView.setHasFixedSize(true);

        mListItem = new ArrayList<>();
        mListItem.add("Hoàng Minh Lợi");
        mListItem.add("Nguyễn Duy Bảo");
        mListItem.add("Nguyễn Ngọc Doanh");
        mListItem.add("Nguyễn Phạm Thế Hà");
        mListItem.add("Trần Anh Đức");
        mListItem.add("Trần Minh Hải");
        mListItem.add("Hoàng Minh Lợi");
        mListItem.add("Nguyễn Duy Bảo");
        mListItem.add("Nguyễn Ngọc Doanh");
        mListItem.add("Nguyễn Phạm Thế Hà");
        mListItem.add("Trần Anh Đức");
        mListItem.add("Trần Minh Hải");
        mListItem.add("Hoàng Minh Lợi");
        mListItem.add("Nguyễn Duy Bảo");
        mListItem.add("Nguyễn Ngọc Doanh");
        mListItem.add("Nguyễn Phạm Thế Hà");
        mListItem.add("Trần Anh Đức");
        mListItem.add("Trần Minh Hải");
        mItemAdapter = new ItemAdapter(mListItem);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setAdapter(mItemAdapter);
        mRecyclerView.setLayoutManager(layoutManager);

        mItemAdapter.setOnItemClickedListener(new ItemAdapter.OnItemClickedListener() {
            @Override
            public void onItemClick(String itemName) {
                Toast.makeText(MainActivity.this, itemName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
