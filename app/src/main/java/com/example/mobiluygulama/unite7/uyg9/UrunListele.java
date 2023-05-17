package com.example.mobiluygulama.unite7.uyg9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.mobiluygulama.databinding.ActivityUrunListeleBinding;

public class UrunListele extends AppCompatActivity {
    {
        ActivityUrunListeleBinding binding =
                ActivityUrunListeleBinding.
                        inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}