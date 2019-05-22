package com.example.misa_customview;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.customView)
    CustomView customView;

    /**
     * Create by tuanld
     * Create by 5/8/2019
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //customView.setValueColor(ContextCompat.getColor(this, android.R.color.holo_blue_bright));
        //customView.setImageVisible(true);

    }

}
