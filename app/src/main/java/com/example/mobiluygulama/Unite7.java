package com.example.mobiluygulama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.mobiluygulama.unite7.uyg1.Uyg1;
import com.example.mobiluygulama.unite7.uyg2.Uyg2;
import com.example.mobiluygulama.unite7.uyg3.Uyg3;
import com.example.mobiluygulama.unite7.uyg4.Uyg4;
import com.example.mobiluygulama.unite7.uyg5.Uyg5;
import com.example.mobiluygulama.unite7.uyg6.Uyg6;
import com.example.mobiluygulama.unite7.uyg7.Uyg7;
import com.example.mobiluygulama.unite7.uyg8.Uyg8;
import com.example.mobiluygulama.unite7.uyg9.Uyg9;
import com.example.mobiluygulama.unite7.uyg10.Uyg10;
import com.example.mobiluygulama.unite7.uyg11.Uyg11;
import com.example.mobiluygulama.unite7.uyg12.Uyg12;
import com.example.mobiluygulama.unite7.uyg13.Uyg13;


public class Unite7 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unite7);
    }

    public void btnUyg1(View view) {
        Intent i = new Intent(Unite7.this, Uyg1.class);
        startActivity(i);
    }
    public void btnUyg2(View view) {
        Intent i = new Intent(Unite7.this, Uyg2.class);
        startActivity(i);
    }
    public void btnUyg3(View view) {
        Intent i = new Intent(Unite7.this, Uyg3.class);
        startActivity(i);
    }
    public void btnUyg4(View view) {
        Intent i = new Intent(Unite7.this, Uyg4.class);
        startActivity(i);
    }
    public void btnUyg5(View view) {
        Intent i = new Intent(Unite7.this, Uyg5.class);
        startActivity(i);
    }
    public void btnUyg6(View view) {
        Intent i = new Intent(Unite7.this, Uyg6.class);
        startActivity(i);
    }
    public void btnUyg7(View view) {
        Intent i = new Intent(Unite7.this, Uyg7.class);
        startActivity(i);
    }
    public void btnUyg8(View view) {
        Intent i = new Intent(Unite7.this, Uyg8.class);
        startActivity(i);
    }
    public void btnUyg9(View view) {
        Intent i = new Intent(Unite7.this, Uyg9.class);
        startActivity(i);
    }
    public void btnUyg10(View view) {
        Intent i = new Intent(Unite7.this, Uyg10.class);
        startActivity(i);
    }
    public void btnUyg11(View view) {
        Intent i = new Intent(Unite7.this, Uyg11.class);
        startActivity(i);
    }
    public void btnUyg12(View view) {
        Intent i = new Intent(Unite7.this, Uyg12.class);
        startActivity(i);
    }
    public void btnUyg13(View view) {
        Intent i = new Intent(Unite7.this, Uyg13.class);
        startActivity(i);
    }
}
