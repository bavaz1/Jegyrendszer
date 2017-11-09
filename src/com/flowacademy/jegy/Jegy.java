package com.flowacademy.jegy;

public class Jegy {
    private float kilometer;
    private String celallomas;
    private boolean ervenyesseg;
    private float kedvezmeny;
    private static float JEGYAR = 25;

    public Jegy(float kilometer, String celallomas, float kedvezmeny) {
        this.kilometer = kilometer;
        this.celallomas = celallomas;
        this.kedvezmeny = kedvezmeny;
        this.ervenyesseg = true;
    }

    public int arKiszamit() {
        return Math.round(kilometer * (JEGYAR - JEGYAR * (kedvezmeny / 100)));
    }

    public void felhasznal() {
        ervenyesseg = false;
    }

    public float getKilometer() {
        return kilometer;
    }

    public void setKilometer(float kilometer) {
        this.kilometer = kilometer;
    }

    public String getCelallomas() {
        return celallomas;
    }

    public void setCelallomas(String celallomas) {
        this.celallomas = celallomas;
    }

    public boolean isErvenyesseg() {
        return ervenyesseg;
    }

    public void setErvenyesseg(boolean ervenyesseg) {
        this.ervenyesseg = ervenyesseg;
    }

    public float getKedvezmeny() {
        return kedvezmeny;
    }

    public void setKedvezmeny(float kedvezmeny) {
        this.kedvezmeny = kedvezmeny;
    }

    public static float getJEGYAR() {
        return JEGYAR;
    }

    public static void setJEGYAR(float JEGYAR) {
        Jegy.JEGYAR = JEGYAR;
    }

    @Override
    public String toString() {
        return "[Cél: " + celallomas +
                "; Kedvezmény: " + kedvezmeny + "%" +
                "; Távolság: " + kilometer + "km" +
                "; Jegyár: " + arKiszamit() + " Ft" +
                ']';
    }
}
