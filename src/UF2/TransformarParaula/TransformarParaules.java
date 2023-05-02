package UF2.TransformarParaula;

import UF2.CalcularMitjana.CalculaMitjana;

import java.util.Scanner;

public class TransformarParaules {

    private Scanner Aleix = new Scanner(System.in);
    private double nota = 0;

    public static void main(String[] args) {
        TransformarParaules programa = new TransformarParaules();
        programa.inici();
}

    public void inici() {
        menu();
        llegirNota();
        CalculaNota();

    }

    public void CalculaNota() {
        if (nota >= 9 && nota <= 10) {
            System.out.println("La nota [ " + nota + " ] es queda en un [ Excelent ]");
        }

        else if (nota >= 7 && nota <= 8) {
            System.out.println("La nota [ " + nota + " ] es queda en un [ Notable ]");
        }

        else if (nota >= 5 && nota <= 6) {
            System.out.println("La nota [ " + nota + " ] es queda en un [ Aprovat ]");
        }

        else if (nota >= 0 && nota <= 4.9) {
            System.out.println("La nota [ " + nota + " ] es queda en un [ Suspès ]");
        }
    }





    public void llegirNota() {
        nota = Aleix.nextDouble();

    }

    public void menu() {
        System.out.println("Ara sabrem les teves notes globals");
        System.out.println("--------------------------------");
        System.out.println("Escriu una nota:");
    }
}
