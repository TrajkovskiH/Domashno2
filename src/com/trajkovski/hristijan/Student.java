package com.trajkovski.hristijan;

import java.util.ArrayList;
import java.util.List;

public class Student extends Covek {
    private String brIndeks;
    private List<Ocenka> ocenkaList;

    public Student() {
        ocenkaList = new ArrayList<>();
    }

    public String getBrIndeks() {
        return brIndeks;
    }

    public void setBrIndeks(String brIndeks) {
        this.brIndeks = brIndeks;
    }

    public List<Ocenka> getOcenkaList() {
        return ocenkaList;
    }

    public void setOcenkaList(List<Ocenka> ocenkaList) {
        this.ocenkaList = ocenkaList;
    }

    public void setOcenka(Ocenka o) {
        ocenkaList.add(o);
    }

    public float getProsek() {
        int vkPredmeti = ocenkaList.size();
        int vkupnoOcenki = 0;
        float prosek = 0f;
        for (Ocenka o : ocenkaList) {
            vkupnoOcenki += o.getOcenka();
        }
        prosek = vkupnoOcenki / vkPredmeti;
        return prosek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime=" + getIme() + '\'' +
                "prezime=" + getPrezime() + '\'' +
                "brIndeks='" + brIndeks + '\'' +
                ", prosek=" + getProsek() +
                '}';
    }
}
