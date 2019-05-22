package com.example.misa_cukcuklite_menu.model;

import android.widget.ImageView;
import android.widget.TextView;

public class ItemFood  {
    private int id;
    private int imgFood;
    private int tvPrice;
    private String tvItemFood;

    public ItemFood(int id,  String tvItemFood,int tvPrice) {
        this.id = id;
        this.tvPrice = tvPrice;
        this.tvItemFood = tvItemFood;
    }

    public ItemFood(int id, int imgFood, int tvPrice, String tvItemFood) {
        this.id = id;
        this.imgFood = imgFood;
        this.tvPrice = tvPrice;
        this.tvItemFood = tvItemFood;
    }

    public ItemFood() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgFood() {
        return imgFood;
    }

    public void setImgFood(int imgFood) {
        this.imgFood = imgFood;
    }

    public int getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(int tvPrice) {
        this.tvPrice = tvPrice;
    }

    public String getTvItemFood() {
        return tvItemFood;
    }

    public void setTvItemFood(String tvItemFood) {
        this.tvItemFood = tvItemFood;
    }
}
