package com.example.mysubmission.model;

public class KomponenDasar {
    String namaKomponen;
    String detailKomponen;
    int gambarKomponen;

    public KomponenDasar(String namaKomponen, String detailKomponen, int gambarKomponen) {
        this.namaKomponen = namaKomponen;
        this.detailKomponen = detailKomponen;
        this.gambarKomponen = gambarKomponen;
    }

    public String getNamaKomponen() {
        return namaKomponen;
    }

    public void setNamaKomponen(String namaKomponen) {
        this.namaKomponen = namaKomponen;
    }

    public String getDetailKomponen() {
        return detailKomponen;
    }

    public void setDetailKomponen(String detailKomponen) { this.detailKomponen = detailKomponen; }

    public int getGambarKomponen() {
        return gambarKomponen;
    }

    public void setGambarKomponen(int gambarKomponen) {
        this.gambarKomponen = gambarKomponen;
    }
}
