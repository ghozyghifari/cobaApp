package com.example.cobaapp.model;

public class Mahasiswa {

    private String nama;
    private String npm;
    private String nomerHp;


    public Mahasiswa(String nama, String npm, String nomerHp){
        this.nama = nama;
        this.npm = npm;
        this.nomerHp = nomerHp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNomerHp() {
        return nomerHp;
    }

    public void setNomerHp(String nomerHp) {
        this.nomerHp = nomerHp;
    }
}
