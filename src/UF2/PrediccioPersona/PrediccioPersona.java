package UF2.PrediccioPersona;

import java.util.Scanner;
public class PrediccioPersona {

    private String mesNaixament = "";

    private String equipFutbol = "";

    private String llenguatgeProgramacio = "";

    private int numSort = 0;

    private  int edat = 0;

    private String nom = "";

    public static void main(String[] args) {
        PrediccioPersona programa = new PrediccioPersona();
        programa.inici();
    }

    private void inici() {
        menu();
        leerMes();
        PreguntarNom();
        PreguntarEdat();
        Condicionals();
        imprimir();

    }

    public void imprimir() {
        System.out.println("-------------------------------\n");

        System.out.println("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.println("\n\n");

        System.out.println(">>> El teu número de la sort és el " + numSort + "!");
        System.out.println("\n\n");

        System.out.println(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.println("\n\n");

        System.out.println(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + ".");
        System.out.println("\n\n");

        System.out.println("Torna quan vulguis!\n");
        System.out.println("-------------------------------------\n\n\n");
    }

    public void Condicionals() {
        if (mesNaixament.equalsIgnoreCase("Gener")) {
            numSort = edat * 3/2;
            equipFutbol = "Bayern de munich";
            llenguatgeProgramacio = "C++";
        }

        else if (mesNaixament.equalsIgnoreCase("Febrer")) {
            numSort = edat -4;
            equipFutbol = "Atlético de Madrid";
            llenguatgeProgramacio = "Python";
        }

        else if (mesNaixament.equalsIgnoreCase("Març")) {
            numSort =  edat / 2;
            equipFutbol = "Chelsea";
            llenguatgeProgramacio = "JavaScript";
        }

        else if (mesNaixament.equalsIgnoreCase("Abril")) {
            numSort = edat % 4;
            equipFutbol = "Manchester city";
            llenguatgeProgramacio = "Node.js";
        }

        else if (mesNaixament.equalsIgnoreCase("Maig")) {
            numSort = edat * 3/6;
            equipFutbol = "Liverpool";
            llenguatgeProgramacio = "React";
        }

        else if (mesNaixament.equalsIgnoreCase("Juny")) {
            numSort = edat + edat;
            equipFutbol = "Real Madrid";
            llenguatgeProgramacio = "C#";
        }

        else if (mesNaixament.equalsIgnoreCase("Juliol")) {
            numSort = edat * edat /5;
            equipFutbol = "BVB";
            llenguatgeProgramacio = "Swift";
        }

        else if (mesNaixament.equalsIgnoreCase("Agost")) {
            numSort = edat * 1/2 * edat;
            equipFutbol = "FCB";
            llenguatgeProgramacio = "Java";
        }

        else if (mesNaixament.equalsIgnoreCase("Setembre")) {
            numSort = edat / edat;
            equipFutbol = "Juve";
            llenguatgeProgramacio = "PHP";
        }

        else if (mesNaixament.equalsIgnoreCase("Octubre")) {
            numSort = edat * 4 / 3;
            equipFutbol = "PSG";
            llenguatgeProgramacio = "R";
        }

        else if (mesNaixament.equalsIgnoreCase("Novembre")) {
            numSort = edat % 2 + 23;
            equipFutbol = "Sevilla CF";
            llenguatgeProgramacio = "GO";
        }

        else if (mesNaixament.equalsIgnoreCase("Desembre")) {
            numSort = (edat + edat) / 2;
            equipFutbol = "Manchester United";
            llenguatgeProgramacio = "Ruby";
        }

        else {
            numSort = 0;
            equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu aniversari";
            llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu aniversari";
            System.out.println("No he entès el que m'has dit!!!!!!!!\n\n");
        }


    }

    public void PreguntarEdat() {
        Scanner Aleix = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Per acabar, quants anys tens?\n");
        edat = Aleix.nextInt();
    }

    public void PreguntarNom() {
        Scanner Aleix = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Com et dius?\n");
        nom = Aleix.nextLine();
    }

    public void leerMes() {
        Scanner Aleix = new Scanner(System.in);
        mesNaixament = Aleix.nextLine();
    }

    public void menu() {
        System.out.println("Escriu el mes en què vas nèixer.");
        System.out.println("\n");
        System.out.println("Gener\tFebrer\tMarç\n");
        System.out.println("Abril\tMaig\tJuny\n");
        System.out.println("juliol\tAgost\tSetembre\n");
        System.out.println("octubre\tNovembre\tDesembre");
        System.out.println("\n\n");
    }




}
