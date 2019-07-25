package PodatekVAT.Podatek;

public class PodatekDlaPolski implements WzrorNaPodatekVAT{

    @Override
    public double liczPodatek(double kwota) {
        return kwota*1.23;
    }
}
