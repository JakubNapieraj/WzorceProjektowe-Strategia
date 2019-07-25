package Sortowania.SposobySortowania;

public class SortowanieBabelkowe implements SposobSortowania{

    @Override
    public int[] sortuj(int[] doPosortowania) {

        for (int i = 0; i < doPosortowania.length; i++) {

            for (int j = 0; j < doPosortowania.length-1 ; j++) {
                if(doPosortowania[j] >doPosortowania[j +1]){
                    int temmp = doPosortowania[j];
                    doPosortowania[j] = doPosortowania[j+1];
                    doPosortowania[j+1] = doPosortowania[j];
                }

            }

        }
        return doPosortowania;
    }
}
