package UF4.Societat;

import UF4.Persona.Persona;

public class MainSocietat {


    public static void main(String[] args) {

        Persona P1 = new Persona();

        P1.setDni("0000000S");
        P1.setEdat(5);
        P1.setNom("Sergio");

        Persona P2 = new Persona("47595843k", "Aleix", 18 );

        Persona P3 = new Persona("00000000s");

        Persona P4 = new Persona(25);

        Persona P5 = new Persona("000000000w", 74);

        Persona P6 = new Persona(56, "Pedro");

        Persona P7 = new Persona("000000000p", "Alex");


        P1.visualitzar();
        P2.visualitzar();
        P3.visualitzar();
        P4.visualitzar();
        P5.visualitzar();
        P6.visualitzar();
        P7.visualitzar();

    }
}
