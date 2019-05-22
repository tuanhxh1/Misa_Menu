package com.example.misa_customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class CustomView extends RelativeLayout {
    private ImageView mImageView;
    private TextView mTextView;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        String titleText = typedArray.getString(R.styleable.CustomView_text_size);

        @SuppressLint("ResourceAsColor")
        int valueColor = typedArray.getColor(R.styleable.CustomView_color, Color.GREEN);
        typedArray.recycle();
        //setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.custom_view, this, true);

        /*TextView title = (TextView) getChildAt(1);
        title.setText(titleText);*/

        // mImageView = (ImageView) getChildAt(0);
        mImageView = findViewById(R.id.imgImage);
        if (valueColor > 0) {
            mImageView.setBackgroundColor(valueColor);

        }


    }

    private void initView() {

    }

    public void setValueColor(int color) {
        mImageView.setBackgroundColor(color);
    }

    public void setImageVisible(boolean visible) {
        mImageView.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

}
