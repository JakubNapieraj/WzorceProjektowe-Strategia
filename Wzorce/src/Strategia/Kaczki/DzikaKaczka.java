package Strategia.Kaczki;

import Strategia.Kaczki.Kwakanie.Kwacz;
import Strategia.Kaczki.Latanie.LatamBoMamSkrzydła;


public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        super(new Kwacz(), new LatamBoMamSkrzydła());


    }

    @Override
    public void wyswietl() {
        System.out.println("Pojawia się dzika Kaczka.");
    }
}
