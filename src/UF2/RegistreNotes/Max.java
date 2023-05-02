package UF2.RegistreNotes;

public class Max {
    public static void main(String args[]) {
        Max programas = new Max();
    }


    public static double calcularMaxim(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}

