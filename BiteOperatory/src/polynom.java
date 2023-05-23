import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class polynom {


    static double spocitatPolynom (Double x, int n, Scanner sc, int [] j ) {

        double v = 0;
        for (int p = n; p >=0 ; p--) {
            v = v * x + j[p];
        }

        //return (x*x*x*x) + (10 * x * x * x) + (35*x*x) + (50*x) + 24;
        return v;
    }


}
