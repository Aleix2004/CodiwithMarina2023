package UF4.ProjecteFigura;

public class Main {
    public static void main(String[] args) {

        Triangle T1 = new Triangle(45, 63);
        T1.ImprimirDades();

        Quadrat Q1 = new Quadrat(4);
        Q1.ImprimirDades();

        Rectangle R1 = new Rectangle();
        R1.setCostat1(7);
        R1.setCostat2(4);
        R1.ImprimirDades();

        Trapezi Tr1 = new Trapezi(8, 6, 3);
        Tr1.ImprimirDades();

        Rombe Ro1 = new Rombe(96, 32);
        Ro1.ImprimirDades();


        Pararllelogram P1 = new Pararllelogram(35, 7);
        P1.ImprimirDades();

        Cercle C1 = new Cercle(9);
        C1.ImprimirDades();
    }
}