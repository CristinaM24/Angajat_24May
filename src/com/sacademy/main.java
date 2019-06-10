package com.sacademy;
import com.sacademymodel.Angajat;
import static com.sacademymodel.Angajat.IT;
import static com.sacademymodel.Angajat.getNrAngajati;

public class main {
    public static void main(String[] args) {
        Angajat a1= new Angajat("A1",1200,"AAA");
        Angajat a2= new Angajat("A2",4000,"Finance");
        Angajat a3= new Angajat("A3",7000,"IT");
        Angajat a4= new Angajat("A4",7100,"IT");
        Angajat a5= new Angajat("A5",7200,"IT");
        System.out.println(a1.afiseaza());
        System.out.println(a5.afiseaza());
        a3.afiseazaDepartamentul();

        System.out.println("Total angajati " + getNrAngajati(null));
        System.out.println("Numar angajati IT "+ getNrAngajati(IT));
    }
}
