package Strategia;


import Strategia.Kaczki.KaczkaGracz;

public class Starter {

    public static void main(String[] args) {

        KaczkaGracz kaczkaGracz = new KaczkaGracz();
        kaczkaGracz.wykonajKwakanie();
        kaczkaGracz.wykonajLatanie();
        System.out.println("Płacimy");
        kaczkaGracz.zaplacZaLatanie();
        kaczkaGracz.zaplacZaKwakanie();
        System.out.println("Efekt");
        kaczkaGracz.wykonajLatanie();
        kaczkaGracz.wykonajKwakanie();

    }
}
