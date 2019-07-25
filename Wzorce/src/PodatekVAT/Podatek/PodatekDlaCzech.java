package PodatekVAT.Podatek;

public class PodatekDlaCzech implements WzrorNaPodatekVAT {
    @Override
    public double liczPodatek(double kwota) {
        return kwota*1.10;
    }
}
