package Strategia.Kaczki;


import Strategia.Kaczki.Kwakanie.Piszcz;
import Strategia.Kaczki.Latanie.NIeLatam;

public class GumowaKaczka extends Kaczka {


    public GumowaKaczka() {
        super(new Piszcz(), new NIeLatam());
    }


    @Override
    public void wyswietl() {
        System.out.println("Pojawia się Gumowa Kaczka.");
    }
}
