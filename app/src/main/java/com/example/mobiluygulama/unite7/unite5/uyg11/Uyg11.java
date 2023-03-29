package com.example.mobiluygulama.unite7.unite5.uyg11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.mobiluygulama.R;

public class Uyg11 extends AppCompatActivity {
    public Integer[] notlar = new Integer[6];
    public int indis = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg11);
        TextView textViewIndis = findViewById(R.id.textViewIndis);
        TextView textViewToplam = findViewById(R.id.textViewToplam);
        EditText editTextSayi = findViewById(R.id.editTextSayi);
        Button buttonEkle = findViewById(R.id.buttonEkle);
        Button buttonSifirla = findViewById(R.id.buttonSifirla);
        buttonEkle.setOnClickListener(view -> {
            if (indis < 6) {
                int sayi;
                sayi = Integer.parseInt(editTextSayi.getText().toString());
                notlar[indis] = sayi;
                indis++;
                textViewIndis.setText("İndis: " + Integer.toString(indis));
                int toplam = 0;
                for (int i = 0; i < indis; i++) {
                    toplam += notlar[i];
                }
                textViewToplam.setText("Toplam: " + Integer.toString(toplam));
                editTextSayi.getText().clear();
            } else {
                textViewIndis.setText("Dizi dolu");
            }
        });
        buttonSifirla.setOnClickListener(view -> {
            indis = 0;
            textViewIndis.setText("İndis: 0");
            textViewToplam.setText("Toplam: 0");
            notlar = new Integer[6];
        });
    }
}