package UF2.RegistreNotes;

import java.util.Scanner;

public class RegistreNotes {
    public static void main(String args[]) {

        Max programa = new Max();
        Min programas = new Min();
        Mitjana aleix = new Mitjana();
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        double max = Max.calcularMaxim(notes);
        double min = Min.calcularMinim(notes);
        double mitjana = Mitjana.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }

    }





