import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //byte x = 0;
        //toBinary(x);
        //toBinary(sifrovat(x, 7));
        int [] j = new int [n + 1];


        for (int v = 0; v <= n; v++) {
            j[v] = sc.nextInt();
        }

        for (double i = 0; i <= 1 ; i  = i + 0.1) {
            System.out.println("f(" + i + ") = " + polynom.spocitatPolynom(i, 4, sc));
        }



    }

    static void toBinary (byte b) {
        String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        System.out.println(s1);
    }

    static byte sifrovat (byte aktualHodnota, int odNulaDoSedmi) {

        return (byte) (aktualHodnota | 1 << odNulaDoSedmi);


    }
}