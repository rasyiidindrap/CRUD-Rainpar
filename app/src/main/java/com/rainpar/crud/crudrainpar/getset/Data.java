package com.rainpar.crud.crudrainpar.getset;

/**
 * Created by RAINPAR on 06/01/2018.
 */

public class Data {
    private String id, judul, isi;

    public Data() {
    }

    public Data(String id, String judul, String isi) {
        this.id = id;
        this.judul = judul;
        this.isi = isi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
