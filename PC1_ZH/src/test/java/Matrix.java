import java.util.ArrayList;

public class Matrix {
    public static int countNumbersDivisibleBySeven(int be[][]) {
        int vissza=0;
        for (int i =0; i< be.length; i++ ) {
            for (int j=0; j< be[i].length; j++) {
                if (be[i][j]%7==0) {
                    vissza++;
                }
            }
        }
        return vissza;
    }
    public static ArrayList<Integer> columnsWithMax (int be[][]) {
        ArrayList<Integer> vissza = new ArrayList<>();
        int v=0;
        int max=0;
        int a=0;
        for (int i =0; i< be.length; i++ ) {
            for (int j=0; j< be[i].length; j++) {
                a = be[i][j];
                if (a>=max ) {
                    if (max==a){
                        vissza.add(i);
                    } else {
                        vissza.clear();
                        vissza.add(i);
                        max=a;
                    }
                    v=i;
                    max=a;

                }
            }
            a=0;
        }
        return vissza;
    }
}
