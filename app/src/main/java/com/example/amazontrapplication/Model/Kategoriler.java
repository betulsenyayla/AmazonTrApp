package com.example.amazontrapplication.Model;

public class Kategoriler {
    private int kategoriResim;
    private String kategoriAd;

    public Kategoriler() {
    }

    public Kategoriler(int kategoriResim, String kategoriAd) {
        this.kategoriResim = kategoriResim;
        this.kategoriAd = kategoriAd;
    }

    public int getKategoriResim() {
        return kategoriResim;
    }

    public void setKategoriResim(int kategoriResim) {
        this.kategoriResim = kategoriResim;
    }

    public String getKategoriAd() {
        return kategoriAd;
    }

    public void setKategoriAd(String kategoriAd) {
        this.kategoriAd = kategoriAd;
    }
}
