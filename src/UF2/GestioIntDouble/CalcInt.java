package UF2.GestioIntDouble;

import UF2.RegistreNotes.Max;

import java.util.Scanner;

public class CalcInt {
    public static void main(String args[]) {
        CalcInt programa = new CalcInt();
    }

    int [] arrayDeInt = new int [10];
    


    public static int calcularMaxim(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int calcularMinim(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int calcularMitjana(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma/array.length;
    }
}

