package com.example.mobiluygulama.unite7.uyg3;

public class Urun {

    private int id;
    private String urunAdi;
    private double fiyat;
    private long adet;
    private int resim;

    public Urun(int id, String urunAdi, double fiyat, long adet, int resim) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.adet = adet;
        this.resim = resim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public long getAdet() {
        return adet;
    }

    public void setAdet(long adet) {
        this.adet = adet;
    }

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
    }


}