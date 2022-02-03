package com.springbootsample.entity;

import org.springframework.data.annotation.Id;
import java.util.HashMap;

public class Kisi {
    @Id
    private String id;
    private String ad;
    private String soyad;
    private HashMap ozellik;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public HashMap getOzellik() {
        return ozellik;
    }

    public void setOzellik(HashMap ozellik) {
        this.ozellik = ozellik;
    }
}
