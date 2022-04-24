package com.example.amazontrapplication.Model;

public class Urunler {
    private String urunAdi;
    private int urunResim;
    private int urunOyResim1, urunOyResim2, urunOyResim3, urunOyResim4, urunOyResim5;
    private String urunOy;

    public Urunler() {
    }

    public Urunler(String urunAdi, int urunResim, int urunOyResim1, int urunOyResim2, int urunOyResim3, int urunOyResim4, int urunOyResim5, String urunOy) {
        this.urunAdi = urunAdi;
        this.urunResim = urunResim;
        this.urunOyResim1 = urunOyResim1;
        this.urunOyResim2 = urunOyResim2;
        this.urunOyResim3 = urunOyResim3;
        this.urunOyResim4 = urunOyResim4;
        this.urunOyResim5 = urunOyResim5;
        this.urunOy = urunOy;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getUrunResim() {
        return urunResim;
    }

    public void setUrunResim(int urunResim) {
        this.urunResim = urunResim;
    }

    public int getUrunOyResim1() {
        return urunOyResim1;
    }

    public void setUrunOyResim1(int urunOyResim1) {
        this.urunOyResim1 = urunOyResim1;
    }

    public int getUrunOyResim2() {
        return urunOyResim2;
    }

    public void setUrunOyResim2(int urunOyResim2) {
        this.urunOyResim2 = urunOyResim2;
    }

    public int getUrunOyResim3() {
        return urunOyResim3;
    }

    public void setUrunOyResim3(int urunOyResim3) {
        this.urunOyResim3 = urunOyResim3;
    }

    public int getUrunOyResim4() {
        return urunOyResim4;
    }

    public void setUrunOyResim4(int urunOyResim4) {
        this.urunOyResim4 = urunOyResim4;
    }

    public int getUrunOyResim5() {
        return urunOyResim5;
    }

    public void setUrunOyResim5(int urunOyResim5) {
        this.urunOyResim5 = urunOyResim5;
    }

    public String getUrunOy() {
        return urunOy;
    }

    public void setUrunOy(String urunOy) {
        this.urunOy = urunOy;
    }
}
