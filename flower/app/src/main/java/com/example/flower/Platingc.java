package com.example.flower;

import java.io.Serializable;

public class Platingc implements Serializable {
    private String n1;
    private int image;
    private int i ;


    public Platingc(String n1, int image, int i) {
        this.n1 = n1;
        this.image = image;
        this.i = i;
    }


    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
