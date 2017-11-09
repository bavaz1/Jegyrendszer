package com.flowacademy.jegy;

public class ReturnJegy extends Jegy {
    private float hasznalatokSzama = 0;

    public ReturnJegy(float kilometer, String celallomas, float kedvezmeny) {
        super(kilometer, celallomas, kedvezmeny);
    }

    @Override
    public void felhasznal() {
        if (hasznalatokSzama == 2) {
            setErvenyesseg(false);
        } else {
            setErvenyesseg(true);
        }
    }

    @Override
    public int arKiszamit() {
        return super.arKiszamit() * 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "][return – jegy]";
    }

    public float getHasznalatokSzama() {
        return hasznalatokSzama;
    }

    public void setHasznalatokSzama(float hasznalatokSzama) {
        this.hasznalatokSzama = hasznalatokSzama;
    }
}
