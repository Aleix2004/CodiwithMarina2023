package UF2.ParametresEntradas;

import UF2.registretemperatures.RegistreTemperatures_PART6;

import java.util.Scanner;

public class EscriureEstrellas {
    public static void main (String[] args) {
        EscriureEstrellas programa = new EscriureEstrellas();
        programa.inici();
}

    public void inici() {
        estrellar(4);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
    }

    public void estrellar(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
