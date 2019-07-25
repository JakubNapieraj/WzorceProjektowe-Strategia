package Strategia.Kaczki;

import Strategia.Kaczki.Kwakanie.KwakanieInterfejs;
import Strategia.Kaczki.Latanie.LatanieInterfejs;

public abstract class Kaczka {

    private KwakanieInterfejs kwakanie;
    private LatanieInterfejs latanie;

    public Kaczka (KwakanieInterfejs kwakanie, LatanieInterfejs latanie){
        this.kwakanie = kwakanie;
        this.latanie = latanie;
    }

    public void plywaj(){
        System.out.println("Plum Plum Plum");
    }

    public void wykonajLatanie(){
        latanie.lec();
    }

    public void wykonajKwakanie(){
        kwakanie.kwakanie();
    }

    public abstract void wyswietl();

    protected void setKwakanie(KwakanieInterfejs nowekwakanie) {
        kwakanie = nowekwakanie;
    }

   protected void setLatanie(LatanieInterfejs nowelatanie) {
        latanie = nowelatanie;
    }
}
