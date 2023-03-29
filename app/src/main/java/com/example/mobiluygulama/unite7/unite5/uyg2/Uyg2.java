package com.example.mobiluygulama.unite7.unite5.uyg2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mobiluygulama.R;

public class Uyg2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg2);
        Button btn1 = findViewById(R.id.button1);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sonuc = topla();
                Toast.makeText(getApplicationContext(),
                        Integer.toString(sonuc),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
    private int topla() {
        return 5 + 10;
    }
}

