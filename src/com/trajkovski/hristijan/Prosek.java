package com.trajkovski.hristijan;

import java.util.Date;

public class Prosek {

    public static void main(String[] args){
        Student student = new Student();
        student.setIme("Hristijan");
        student.setPrezime("Trajkovski");
        student.setBrIndeks("INKI702");
        student.setOcenka(new Ocenka("Matematika", new Date(), 6));
        student.setOcenka(new Ocenka("Programiranje", new Date(), 5));
        student.setOcenka(new Ocenka("Gradinarstvo", new Date(), 10));
        System.out.println(student.toString());
        for (Ocenka o : student.getOcenkaList()) {
            System.out.println("Ocenki: " + o.toString());
        }
        System.out.println("Prosek: " + student.getProsek());
    }
}
