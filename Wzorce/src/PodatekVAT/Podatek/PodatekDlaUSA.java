package PodatekVAT.Podatek;

public class PodatekDlaUSA implements WzrorNaPodatekVAT {
    @Override
    public double liczPodatek(double kwota) {
        return kwota*1.15;
    }
}
