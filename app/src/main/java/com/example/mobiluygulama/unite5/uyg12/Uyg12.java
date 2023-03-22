package com.example.mobiluygulama.unite5.uyg12;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import com.example.mobiluygulama.R;

public class Uyg12 extends AppCompatActivity {
    Button buttonEkle;
    EditText editTextAd;
    ListView listViewAdlar;
    ArrayList<String> isimlerListesi = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg12);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, isimlerListesi);
        buttonEkle = findViewById(R.id.buttonEkle);
        editTextAd = findViewById(R.id.editTextAd);
        listViewAdlar = findViewById(R.id.listViewAdlar);
        listViewAdlar.setAdapter(adapter);
        buttonEkle.setOnClickListener(view -> {
            String ad = editTextAd.getText().toString();
            isimlerListesi.add(ad);
            adapter.notifyDataSetChanged();
            editTextAd.getText().clear();
        });
        listViewAdlar.setOnItemClickListener((adapterView, view, i, l) -> {
            isimlerListesi.remove(i);
            adapter.notifyDataSetChanged();
        });
    }
}