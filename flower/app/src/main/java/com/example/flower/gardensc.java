package com.example.flower;

import android.net.Uri;

import com.google.android.gms.maps.MapView;

import java.io.Serializable;

public class gardensc implements Serializable {
    private String name;
    private int image;
    private String n1 ;


    public gardensc(String name, int image, String n1) {
        this.name = name;

        this.image = image;
        this.n1 = n1;
    }

    public gardensc(String name, String u, int image, String n1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }
}
