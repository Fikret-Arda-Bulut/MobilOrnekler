package com.example.mobiluygulama.unite7.uyg3;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mobiluygulama.R;

import java.util.ArrayList;

public class Uyg3 extends AppCompatActivity {
    SQLiteDatabase database;
    Urun urun;
    ArrayList<Urun> urunler;
    ListView listeUrunler;
    UrunAdapter urunAdapter;
    Button btnKaydet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u7_uyg3);
        urunler = new ArrayList<>();
        listeUrunler = findViewById(R.id.urunListe);
        urunAdapter = new UrunAdapter(Uyg3.this, urunler);
        btnKaydet = findViewById(R.id.btnKayitEkle);
        listeUrunler.setAdapter(urunAdapter);
        getAllurunler();

        listeUrunler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Uyg3.this, UrunDetay.class);
                i.putExtra("id", urunler.get(position).getId());
                startActivity(i);
            }
        });
    }


    public void btnYeniKayitEkleClick(View view) {
        Intent i = new Intent(Uyg3.this, UrunKayit.class);
        i.putExtra("mod", "ekle");
        startActivity(i);
    }

    private void getAllurunler() {
        database = this.openOrCreateDatabase("Urun", MODE_PRIVATE, null);
        Cursor cursor = database.rawQuery("SELECT * FROM urunler", null);
        int kolonId = cursor.getColumnIndex("id");
        int kolonUrunAdi = cursor.getColumnIndex("urunadi");
        int kolonFiyat = cursor.getColumnIndex("fiyat");
        int kolonAdet = cursor.getColumnIndex("adet");

        while (cursor.moveToNext()) {
            int id = cursor.getInt(kolonId);
            String urunAdi = cursor.getString(kolonUrunAdi);
            double fiyat = cursor.getDouble(kolonFiyat);
            long adet = cursor.getLong(kolonAdet);

            urun = new Urun(id, urunAdi, fiyat, adet, R.drawable.resim_yok);
            urunler.add(urun);
        }
        cursor.close();
    }
}

