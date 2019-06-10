package com.sacademymodel;

public class Angajat {
    private String nume;
    private int salariu;
    private String departament;
    private static int nrAngajati;
    private static int nrAngajatiIT;
    public static final String IT="IT";

    public Angajat(String nume, int salariu, String departament) {
        this.nume = nume;
        this.salariu = salariu;
        this.departament = departament;
        nrAngajati++;
        if(departament.equals(IT)){
            nrAngajatiIT++;
        }
    }

    public String afiseaza(){
        return "Angajatul "+nume+" are salariul "+salariu+".";
    }

    public void afiseazaDepartamentul(){
        System.out.println("Angajatul "+ nume
                + " este din departamaentul "+ departament+".");
    }

    public static int getNrAngajati(String departament){
        if(IT.equals(departament))
            return nrAngajatiIT;
        return nrAngajati;
    }
}
