package Strategia.Kaczki;

import Strategia.Kaczki.Kwakanie.Kwacz;
import Strategia.Kaczki.Latanie.LatamBoMamSkrzydła;


public class PlaskonosKaczka extends Kaczka {

    public PlaskonosKaczka() {
        super(new Kwacz(), new LatamBoMamSkrzydła());
    }

    @Override
    public void wyswietl() {
        System.out.println("Pojawia się Płaskonos.");
    }
}
