package com.example.mobiluygulama.unite7.unite5.uyg6;

public class Dortgen {
    public Integer kisaKenar;
    public Integer uzunKenar;

    public Dortgen(Integer kisaKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = kisaKenar;
    }

    public Dortgen(Integer kisaKenar, Integer uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Integer alanBul(){
        Integer alan;
        alan = kisaKenar * uzunKenar;
        return alan;
    }
}
