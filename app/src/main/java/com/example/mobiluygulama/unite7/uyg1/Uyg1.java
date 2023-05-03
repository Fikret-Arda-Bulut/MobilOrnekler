package com.example.mobiluygulama.unite7.uyg1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulama.R;

public class Uyg1 extends AppCompatActivity {
        EditText kullaniciEdit;
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.u7_uyg1);
            kullaniciEdit = findViewById(R.id.kullaniciEdit);
            SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
            String gelenveri = sharedPreferences.getString("kullanici","");
            if (!gelenveri.isEmpty()) {
                kullaniciEdit.setText(gelenveri);
            }
        }
        public void btnKaydetClick (View view){
            String veri;
            veri = kullaniciEdit.getText().toString();
            SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("kullanici", veri);
            editor.apply();
        }
    }



