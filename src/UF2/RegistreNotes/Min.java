package UF2.RegistreNotes;

public class Min {
    public static void main(String args[]) {
        Min aleix = new Min();
    }


    public static double calcularMinim(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}