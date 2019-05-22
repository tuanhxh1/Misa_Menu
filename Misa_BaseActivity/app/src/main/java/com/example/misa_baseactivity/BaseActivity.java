package com.example.misa_baseactivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

public abstract class BaseActivity extends AppCompatActivity {
    private TextView mTextScreenTitle;
    private ImageButton mImageButtonBack;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Loading");
        mProgressDialog.setCancelable(false);
        mProgressDialog.setIndeterminate(true);
    }

    @Override
    public void setContentView(int layoutResID) {
        ConstraintLayout constraintLayout= (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_main,null);
        FrameLayout activityContainer = constraintLayout.findViewById(R.id.layout_container);
        mTextScreenTitle = (TextView) constraintLayout.findViewById(R.id.text_screen_title);
        mImageButtonBack = (ImageButton) constraintLayout.findViewById(R.id.image_back_button);
        super.setContentView(layoutResID);
    }

    public  void setScreenTitle(int resId){
        mTextScreenTitle.setText(resId);
    }

    public  void setScreenTitle(String resId){
        mTextScreenTitle.setText(resId);
    }

    public ImageButton getBackButton(){
        return mImageButtonBack;
    }

    public void showProgressDialog(){
        if(!mProgressDialog.isShowing()){
            mProgressDialog.show();
        }
    }

    public void dismissProgressDialog(){
        if(mProgressDialog.isShowing()){
            mProgressDialog.dismiss();
        }
    }
}
