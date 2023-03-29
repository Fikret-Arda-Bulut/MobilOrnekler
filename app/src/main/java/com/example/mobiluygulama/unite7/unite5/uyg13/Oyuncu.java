package com.example.mobiluygulama.unite7.unite5.uyg13;

import com.example.mobiluygulama.unite5.uyg13.Asker;
import com.example.mobiluygulama.unite5.uyg13.Tankci;
import com.example.mobiluygulama.unite5.uyg13.Topcu;

public class Oyuncu
{
    private String isim;
    private Integer can;
    public String getIsim()
    {
        return isim;
    }
    public void setIsim(String isim)
    {
        this.isim = isim;
    }
    public Integer getCan()
    {
        return can;
    }
    public void setCan(Integer can)
    {
        this.can = can;
    }
    public Oyuncu(String isim, Integer can)
    {
        this.isim = isim;
        this.can = can;
    }
    public Asker tankci = new Tankci();
    public Asker topcu = new Topcu();
}

