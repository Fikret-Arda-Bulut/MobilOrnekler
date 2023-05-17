package com.example.mobiluygulama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.example.mobiluygulama.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDB();
        //insertUrun();
        //updateUrun();
        //deleteUrun();
        //getAllUrunler
    }
    private void createDB(){
        database = this.openOrCreateDatabase("Urun", MODE_PRIVATE, null);

        String TABLO = "CREATE TABLE IF NOT EXISTS urunler(id INTEGER PRIMARY KEY, urunadi TEXT, fiyat DOUBLE, adet INTEGER)";
        database.execSQL(TABLO);
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