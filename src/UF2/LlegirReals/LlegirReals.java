package UF2.LlegirReals;

import java.util.Scanner;

public class LlegirReals {

    public void main (String[] args) {
        LlegirReals programa = new LlegirReals();
        programa.inici();
    }

    public void inici() {
        System.out.println("Llegiu un enter pel teclat:");
        double a = llegirRealsTeclat();
        System.out.println("L'enter ha estat " + a + ".");
        System.out.println("Llegiu un altre enter pel teclat:");
        a = llegirRealsTeclat();
        System.out.println("L'altre enter ha estat " + a + ".");
    }

    public double llegirRealsTeclat() {
        Scanner lector = new Scanner(System.in);
        double RealLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextDouble();

            if (llegit) {
                RealLlegit = lector.nextDouble();
            }

            else {
                System.out.println("Aix no es un real.");
                lector.next();
            }

        }
        return RealLlegit;
    }

}
