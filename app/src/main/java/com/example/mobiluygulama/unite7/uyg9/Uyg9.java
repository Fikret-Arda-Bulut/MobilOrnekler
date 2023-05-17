package com.example.mobiluygulama.unite7.uyg9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.mobiluygulama.R;
import com.example.mobiluygulama.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Uyg9 extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        if(FirebaseAuth.getInstance().getCurrentUser()!=null){
            Intent intent=new Intent(this,UrunListele.class);
            startActivity(intent);
        }
    }

    public void onClick(View view) {
        String eposta = binding.txtEPosta.getText().toString().trim();
        String sifre = binding.txtSifre.getText().toString().trim();
        FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(eposta, sifre)
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        binding.textViewDurum.setTextColor(Color.parseColor("#2e7d32"));
                        binding.textViewDurum.setText("Kullanıcı oluşturuldu");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        binding.textViewDurum.setTextColor(Color.parseColor("#ff1744"));
                        binding.textViewDurum.setText("Kullanıcı oluşturulamadı\n" +
                                e.getLocalizedMessage());
                    }
                });
    }

    public void onClick(View view) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        String eposta = binding.txtEPosta.getText().toString().trim();
        String sifre = binding.txtSifre.getText().toString().trim();
        if (eposta.equals("") || sifre.equals("")) {
            binding.textViewDurum.setTextColor(Color.parseColor("#ff1744"));
            binding.textViewDurum.setText("E-posta veya Şifre boş olamaz");
        } else {
            firebaseAuth
                    .signInWithEmailAndPassword(eposta, sifre)
                    .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            binding.textViewDurum.setTextColor(Color.parseColor("#2e7d32"));
                            binding.textViewDurum.setText("Giriş başarılı");
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            binding.textViewDurum.setTextColor(Color.parseColor("#ff1744"));
                            binding.textViewDurum.setText("Giriş başarısız\n" +
                                    e.getLocalizedMessage());
                        }
                    });
        }
    }

    public void onClick(View view) {
        String eposta=binding.txtEPosta.getText().toString().trim();
        FirebaseAuth.getInstance()
                .sendPasswordResetEmail(eposta)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        binding.textViewDurum.setTextColor(Color.parseColor("#2e7d32"));
                        binding.textViewDurum.setText("Hatırlatma e-postası gönderildi");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        binding.textViewDurum.setTextColor(Color.parseColor("#ff1744"));
                        binding.textViewDurum.setText("Hatırlatma e-postası gönderilemedi\n"+
                                e.getLocalizedMessage());
                    }
                });
    }


}
