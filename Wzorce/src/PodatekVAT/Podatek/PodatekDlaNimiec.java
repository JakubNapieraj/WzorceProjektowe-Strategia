package PodatekVAT.Podatek;


public class PodatekDlaNimiec implements WzrorNaPodatekVAT {


    @Override
    public double liczPodatek(double kwota) {
        return kwota*1.30;
    }
}
