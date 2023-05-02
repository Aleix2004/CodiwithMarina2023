package UF2.GestioIntDouble;

import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        Scanner Aleix = new Scanner(System.in);
        System.out.println(("Vols Int o double"));
        char paraula = Aleix.next().charAt(0);

        if (paraula == 'i'){
            CalcInt programa = new CalcInt();
        }




    }
}
