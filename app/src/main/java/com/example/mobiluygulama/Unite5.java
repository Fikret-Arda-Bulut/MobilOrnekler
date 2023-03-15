package com.example.mobiluygulama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulama.unite5.uyg1.Uyg1;
import com.example.mobiluygulama.unite5.uyg2.Uyg2;
import com.example.mobiluygulama.unite5.uyg3.Uyg3;
import com.example.mobiluygulama.unite5.uyg4.Uyg4;
import com.example.mobiluygulama.unite5.uyg5.Uyg5;
import com.example.mobiluygulama.unite5.uyg6.Uyg6;
import com.example.mobiluygulama.unite5.uyg7.Uyg7;
import com.example.mobiluygulama.unite5.uyg8.Uyg8;
import com.example.mobiluygulama.unite5.uyg9.Uyg9;
import com.example.mobiluygulama.unite5.uyg10.Uyg10;
import com.example.mobiluygulama.unite5.uyg11.Uyg11;
import com.example.mobiluygulama.unite5.uyg12.Uyg12;
import com.example.mobiluygulama.unite5.uyg13.Uyg13;

public class Unite5 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unite5);
    }

    public void btnUyg1(View view) {
        Intent i = new Intent(Unite5.this, Uyg1.class);
        startActivity(i);
    }
    public void btnUyg2(View view) {
        Intent i = new Intent(Unite5.this, Uyg2.class);
        startActivity(i);
    }
    public void btnUyg3(View view) {
        Intent i = new Intent(Unite5.this, Uyg3.class);
        startActivity(i);
    }
    public void btnUyg4(View view) {
        Intent i = new Intent(Unite5.this, Uyg4.class);
        startActivity(i);
    }
    public void btnUyg5(View view) {
        Intent i = new Intent(Unite5.this, Uyg5.class);
        startActivity(i);
    }
    public void btnUyg6(View view) {
        Intent i = new Intent(Unite5.this, Uyg6.class);
        startActivity(i);
    }
    public void btnUyg7(View view) {
        Intent i = new Intent(Unite5.this, Uyg7.class);
        startActivity(i);
    }
    public void btnUyg8(View view) {
        Intent i = new Intent(Unite5.this, Uyg8.class);
        startActivity(i);
    }
    public void btnUyg9(View view) {
        Intent i = new Intent(Unite5.this, Uyg9.class);
        startActivity(i);
    }
    public void btnUyg10(View view) {
        Intent i = new Intent(Unite5.this, Uyg10.class);
        startActivity(i);
    }
    public void btnUyg11(View view) {
        Intent i = new Intent(Unite5.this, Uyg11.class);
        startActivity(i);
    }
    public void btnUyg12(View view) {
        Intent i = new Intent(Unite5.this, Uyg12.class);
        startActivity(i);
    }
    public void btnUyg13(View view) {
        Intent i = new Intent(Unite5.this, Uyg13.class);
        startActivity(i);
    }
}
