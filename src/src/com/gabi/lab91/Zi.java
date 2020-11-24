package com.gabi.lab91;

public class Zi {
    private String nume;
    private boolean proprietate;

    public Zi(String nume, boolean proprietate){
        this.nume=nume;
        this.proprietate=proprietate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isProprietate() {
        return proprietate;
    }

    public void setProprietate(boolean proprietate) {
        this.proprietate = proprietate;
    }
}
