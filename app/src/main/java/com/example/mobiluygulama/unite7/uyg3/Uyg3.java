package com.example.mobiluygulama.unite7.uyg3;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulama.R;

public class Uyg3 extends AppCompatActivity {
    SQLiteDatabase database;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u7_uyg3);

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
}
