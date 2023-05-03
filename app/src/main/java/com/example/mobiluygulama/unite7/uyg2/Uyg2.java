package com.example.mobiluygulama.unite7.uyg2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.mobiluygulama.R;

public class Uyg2 extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    int veri;
    RadioButton radioAcik;
    RadioButton radioKaranlik;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u7_uyg2);

        radioAcik = findViewById(R.id.radioAcik);
        radioKaranlik = findViewById(R.id.radioKaranlik);

        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        if (veri == AppCompatDelegate.MODE_NIGHT_NO) {
            radioAcik.setChecked(true);
            radioKaranlik.setChecked(false);

        }
        else {
            radioAcik.setChecked(false);
            radioKaranlik.setChecked(true);
        }

    }
    public void onRadioClicked(View view){
        boolean checked=((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.radioAcik:
                if(checked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor.putInt("tema", AppCompatDelegate.MODE_NIGHT_NO);
                    editor.apply();
                }
                break;
            case R.id.radioKaranlik:
                if(checked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor.putInt("tema",AppCompatDelegate.MODE_NIGHT_YES);
                    editor.apply();
                }
                break;
        }

    }
    protected void onDestroy() {
        sharedPreferences=null;
        super.onDestroy();
    }


}
