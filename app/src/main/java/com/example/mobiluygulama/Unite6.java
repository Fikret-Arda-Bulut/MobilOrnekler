package com.example.mobiluygulama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulama.unite6.uyg1.Uyg1;
import com.example.mobiluygulama.unite6.uyg2.Uyg2;
import com.example.mobiluygulama.unite6.uyg3.Uyg3;
import com.example.mobiluygulama.unite6.uyg4.Uyg4;
import com.example.mobiluygulama.unite6.uyg5.Uyg5;
import com.example.mobiluygulama.unite6.uyg6.Uyg6;
import com.example.mobiluygulama.unite6.uyg7.Uyg7;
import com.example.mobiluygulama.unite6.uyg8.Uyg8;
import com.example.mobiluygulama.unite6.uyg9.Uyg9;
import com.example.mobiluygulama.unite6.uyg10.Uyg10;

public class Unite6 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unite6);
    }
    public void btnUyg1(View view) {
        Intent i = new Intent(Unite6.this, Uyg1.class);
        startActivity(i);
    }
    public void btnUyg2(View view) {
        Intent i = new Intent(Unite6.this, Uyg2.class);
        startActivity(i);
    }
    public void btnUyg3(View view) {
        Intent i = new Intent(Unite6.this, Uyg3.class);
        startActivity(i);
    }
    public void btnUyg4(View view) {
        Intent i = new Intent(Unite6.this, Uyg4.class);
        startActivity(i);
    }
    public void btnUyg5(View view) {
        Intent i = new Intent(Unite6.this, Uyg5.class);
        startActivity(i);
    }
    public void btnUyg6(View view) {
        Intent i = new Intent(Unite6.this, Uyg6.class);
        startActivity(i);
    }
    public void btnUyg7(View view) {
        Intent i = new Intent(Unite6.this, Uyg7.class);
        startActivity(i);
    }
    public void btnUyg8(View view) {
        Intent i = new Intent(Unite6.this, Uyg8.class);
        startActivity(i);
    }
    public void btnUyg9(View view) {
        Intent i = new Intent(Unite6.this, Uyg9.class);
        startActivity(i);
    }
    public void btnUyg10(View view) {
        Intent i = new Intent(Unite6.this, Uyg10.class);
        startActivity(i);
    }
}
