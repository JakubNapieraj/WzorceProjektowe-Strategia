package PodatekVAT;

import PodatekVAT.Podatek.PodatekDlaCzech;
import PodatekVAT.Podatek.PodatekDlaNimiec;
import PodatekVAT.Podatek.PodatekDlaPolski;
import PodatekVAT.Podatek.PodatekDlaUSA;
import java.util.Scanner;

public class WyliczaniePodatku {
    Scanner scanner = new Scanner(System.in);


    public void listaKrajów(){

    }

    public String ProszeWybracKraj(){
        System.out.println("Proszę Wpisać nazwę kraju : ");
        String nazwaKraju = scanner.nextLine();
        System.out.println("Wybrano Kraj " + nazwaKraju.toUpperCase());
        return nazwaKraju.toUpperCase();
    }



    public void wyliczanieOdpowiedniegoPodatku(){
        String kraj = ProszeWybracKraj();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę wprowadzić Kwotę netto : ");
       int kwota = scanner.nextInt();

        if(kraj.equals("NIEMCY")){
            PodatekDlaNimiec podatekDlaNimiec = new PodatekDlaNimiec();
            System.out.println(podatekDlaNimiec.liczPodatek(kwota));
        }else if(kraj.equals("POLSKA")){
            PodatekDlaPolski podatekDlaPolski = new PodatekDlaPolski();
            System.out.println(podatekDlaPolski.liczPodatek(kwota));
        }else if(kraj.equals("USA")){
            PodatekDlaUSA podatekDlaUSA = new PodatekDlaUSA();
            System.out.println(podatekDlaUSA.liczPodatek(kwota));
        }else if(kraj.equals("CZECHY")){
            PodatekDlaCzech podatekDlaCzech = new PodatekDlaCzech();
            System.out.println(podatekDlaCzech.liczPodatek(kwota));
        }else {
            System.out.println("Nie liczymy podatku dla wybranego Kraju :(");
        }
    }
}
