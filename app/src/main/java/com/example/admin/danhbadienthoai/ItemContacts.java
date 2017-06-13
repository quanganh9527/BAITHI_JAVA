package com.example.admin.danhbadienthoai;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by admin on 6/11/2017.
 */

public class ItemContacts {
    private String name;
    private String number;
    private ImageView image;
    private boolean gender;

    public ItemContacts(String name, String number, boolean gender) {
        this.name = name;
        this.number = number;
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
