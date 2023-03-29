package com.example.mobiluygulama.unite5.uyg13;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import com.example.mobiluygulama.R;

public class Uyg13 extends AppCompatActivity {
    Oyuncu oyuncu1;
    Oyuncu oyuncu2;
    Button buttonTank1;
    Button buttonTank2;
    Button buttonTopcu1;
    Button buttonTopcu2;
    Button buttonReset;
    ProgressBar progressBar1;
    ProgressBar progressBar2;
    TextView textViewIsabet;
    Integer isabet;
    ArrayList<Oyuncu> oyuncular = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg13);
        oyuncu1 = new Oyuncu("Oyuncu 1",100);
        oyuncu2 = new Oyuncu("Oyuncu 2",100);
        oyuncular.add(oyuncu1);
        oyuncular.add(oyuncu2);
        buttonTank1 = findViewById(R.id.buttonTankci1);
        buttonTank2 = findViewById(R.id.buttonTankci2);
        buttonTopcu1 = findViewById(R.id.buttonTopcu1);
        buttonTopcu2 = findViewById(R.id.buttonTopcu2);
        buttonReset = findViewById(R.id.buttonReset);
        progressBar1 = findViewById(R.id.progressBar1);
        progressBar2 = findViewById(R.id.progressBar2);
        textViewIsabet = findViewById(R.id.textViewIsabet);
        buttonTank1.setOnClickListener(view -> {
            isabet = oyuncu1.tankci.atesEt(oyuncu2);
            progressBar2.setProgress(oyuncu2.getCan());
            textViewIsabet.setText(isabet.toString());
            oyuncuKontrolet();
        });
        buttonTopcu1.setOnClickListener(view -> {
            isabet = oyuncu1.topcu.atesEt(oyuncu2);
            progressBar2.setProgress(oyuncu2.getCan());
            textViewIsabet.setText(isabet.toString());
            oyuncuKontrolet();
        });
        buttonTank2.setOnClickListener(view -> {
            isabet = oyuncu2.tankci.atesEt(oyuncu1);
            progressBar1.setProgress(oyuncu1.getCan());
            textViewIsabet.setText(isabet.toString());
            oyuncuKontrolet();
        });
        buttonTopcu2.setOnClickListener(view -> {
            isabet = oyuncu2.topcu.atesEt(oyuncu1);
            progressBar1.setProgress(oyuncu1.getCan());
            textViewIsabet.setText(isabet.toString());
            oyuncuKontrolet();
        });
        buttonReset.setOnClickListener(view -> {
            oyuncu1.setCan(100);
            oyuncu2.setCan(100);
            progressBar1.setProgress(oyuncu1.getCan());
            progressBar2.setProgress(oyuncu2.getCan());
            textViewIsabet.setText("0");
        });
    }
    private void oyuncuKontrolet() {
        for (Oyuncu oyuncu:oyuncular) {
            if (oyuncu.getCan()<=0 )
                textViewIsabet.setText("Oyun Bitti");
        }
    }
}

