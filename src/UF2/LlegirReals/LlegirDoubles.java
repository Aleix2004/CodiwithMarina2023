package UF2.LlegirReals;

import java.util.Scanner;

public class LlegirDoubles {
    public static void main(String[] args) {
        LlegirDoubles programa = new LlegirDoubles();
        programa.inici();
    }

    public void inici() {
        System.out.println("Llegiu un real pel teclat:");
        double a = llegirRealsTeclat();
        System.out.println("El real ha estat " + a + ".");
        System.out.println("Llegiu un altre real pel teclat:");
        a = llegirRealsTeclat();
        System.out.println("L'altre real ha estat " + a + ".");
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
