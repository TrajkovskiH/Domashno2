package com.trajkovski.hristijan;

import java.util.Date;

public class Ocenka {
    private String predmet;
    private Date datumNaIspit;
    private Integer ocenka;

    public Ocenka(String predmet, Date datumNaIspit, Integer ocenka) {
        if (ocenka > 4 && ocenka < 11) {
            this.predmet = predmet;
            this.datumNaIspit = datumNaIspit;
            this.ocenka = ocenka;
        }
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Date getDatumNaIspit() {
        return datumNaIspit;
    }

    public void setDatumNaIspit(Date datumNaIspit) {
        this.datumNaIspit = datumNaIspit;
    }

    public Integer getOcenka() {
        return ocenka;
    }

    public void setOcenka(Integer ocenka) {
        this.ocenka = ocenka;
    }

    @Override
    public String toString() {
        return "Ocenka{" +
                "predmet='" + predmet + '\'' +
                ", datumNaIspit=" + datumNaIspit +
                ", ocenka=" + ocenka +
                '}';
    }
}
