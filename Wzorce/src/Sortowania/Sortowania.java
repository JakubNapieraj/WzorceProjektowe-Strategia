package Sortowania;

import Sortowania.SposobySortowania.SortowanieBabelkowe;
import Sortowania.SposobySortowania.SortowaniePrzezZliczanie;
import Sortowania.SposobySortowania.SposobSortowania;

public class Sortowania {
    private SposobSortowania sposobSortowania;
    private int [] doPosortowania;
    public Sortowania(int[] doPosortowania){
        if(sprwadzLiczbyUjemne(doPosortowania)){
            sposobSortowania = new SortowanieBabelkowe();
        }else {
            sposobSortowania = new SortowaniePrzezZliczanie();
        }
        this.doPosortowania =doPosortowania;
    }

    public int [] posortuj(){
        return sposobSortowania.sortuj(this.doPosortowania);
    }


    private boolean sprwadzLiczbyUjemne(int[] doPosortowania){
        for (int i = 0; i <doPosortowania.length ; i++) {
           if(doPosortowania[i] < 0) {
               return true;
           }

        }
        return false;
    }

}
