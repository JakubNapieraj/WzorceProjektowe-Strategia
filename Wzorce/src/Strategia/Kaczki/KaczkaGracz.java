package Strategia.Kaczki;


import Strategia.Kaczki.Kwakanie.Kwacz;
import Strategia.Kaczki.Kwakanie.Piszcz;
import Strategia.Kaczki.Latanie.LatamBoMamSkrzydła;
import Strategia.Kaczki.Latanie.NIeLatam;

public class KaczkaGracz extends Kaczka {


    public KaczkaGracz() {
        super(new Piszcz(), new NIeLatam());
    }

    @Override
    public void wyswietl() {
        System.out.println("Pojawia się Kaczka Gracz.");
    }

    public void zaplacZaLatanie(){
        System.out.println("Jesteś biedniejszy o 5 zł, ale twoja kaczka umie latać");
        setLatanie(new LatamBoMamSkrzydła());
    }
    public void zaplacZaKwakanie(){
        System.out.println("Jesteś biedniejszy o 5 zł, ale twoja kaczka umie kwakać");
        setKwakanie(new Kwacz());
    }
}
