package com.example.mobiluygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //************************************************************************//
    //
    //***********************************************************************//
    public void btnUnite1(View view) {
        Intent i = new Intent(MainActivity.this, Unite1.class);
        startActivity(i);
    }

    public void btnUnite2(View view) {
        Intent i = new Intent(MainActivity.this, Unite2.class);
        startActivity(i);
    }

    public void btnUnite3(View view) {
        Intent i = new Intent(MainActivity.this, Unite3.class);
        startActivity(i);
    }

    public void btnUnite4(View view) {
        Intent i = new Intent(MainActivity.this, Unite4.class);
        startActivity(i);
    }

    public void btnUnite5(View view) {
        Intent i = new Intent(MainActivity.this, Unite5.class);
        startActivity(i);
    }

    public void btnUnite6(View view) {
        Intent i = new Intent(MainActivity.this, Unite6.class);
        startActivity(i);
    }

    public void btnUnite7(View view) {
        Intent i = new Intent(MainActivity.this, Unite7.class);
        startActivity(i);
    }

    public void btnUnite8(View view) {
        Intent i = new Intent(MainActivity.this, Unite8.class);
        startActivity(i);
    }

    public void btnUnite9(View view) {
        Intent i = new Intent(MainActivity.this, Unite9.class);
        startActivity(i);
    }
}