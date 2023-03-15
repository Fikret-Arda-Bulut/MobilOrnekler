package com.example.mobiluygulama.unite5.uyg7;

import android.util.Log;

public class Personel {
    private int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<18 || yas>55){
            Log.e("Kapsülleme","Hatalı Yaş");
            yas = 18;
        }
        this.yas = yas;
    }
}
