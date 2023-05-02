package UF2.Recursivitat;

import java.util.Scanner;

public class Recursivitat{
	public static void main(String args[]) {
	    Recursivitat programa = new Recursivitat();
		inici();
	}

	public static void inici() {
		int x = leerDatoUser();
		recursivitat(x);
	}

	public static int leerDatoUser() {
		System.out.println("Quin número vols?");
		Scanner Aleix = new Scanner(System.in);
		int x = Aleix.nextInt();
		return x;
	}

	public static void recursivitat(int a) {
		if(a >= 1) {
			if (a % 2 == 0) {
				System.out.println("El nombre " + a + " és parell");
				//recursivitat(a - 1);
			} else {
				System.out.println("El nombre " + a + " és senar");
				//recursivitat(a - 1);
			}
			recursivitat(a-1);
		}
	}
}

