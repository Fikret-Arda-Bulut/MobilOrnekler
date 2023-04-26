package com.example.mobiluygulama.unite6.uyg9;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mobiluygulama.R;

public class Uyg9 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg8);
    }

    public void fragment1Gecis(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BirinciFragment birinciFragment = new BirinciFragment();
        fragmentTransaction.replace(R.id.frameLayout_Main,birinciFragment);
        fragmentTransaction.commit();
    }

    public void fragment2Gecis(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        İkinciFragment ikinciFragment = new İkinciFragment();
        fragmentTransaction.replace(R.id.frameLayout_Main,ikinciFragment);
        fragmentTransaction.commit();
    }
}
