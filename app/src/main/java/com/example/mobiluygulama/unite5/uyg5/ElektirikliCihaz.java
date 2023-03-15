package com.example.mobiluygulama.unite5.uyg5;

public class ElektirikliCihaz {
    public String cihazAdi;
    public int cihazKW;
    public int gunlukSaatKullanim;
    public int aylikTuketim(){
        int aylikKullanim;
        aylikKullanim = cihazKW*gunlukSaatKullanim*30;
        return aylikKullanim;
    }
}
