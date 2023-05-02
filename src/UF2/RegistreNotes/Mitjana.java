package UF2.RegistreNotes;

public class Mitjana {

        public static void main(String args[]) {
                Mitjana programa = new Mitjana();
        }


public static double calcularMitjana(double[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
        suma = suma + array[i];
        }
        return suma/array.length;
        }
}