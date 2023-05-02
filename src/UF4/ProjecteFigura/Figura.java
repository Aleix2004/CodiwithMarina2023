package UF4.ProjecteFigura;

import UF2.CalculAreaFuncions.CalculArees;

public class Figura {

    public String figura;
    public static int id;

    public Figura(){
        id++;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {

        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void ImprimirDades(){
        CalcularArea();
        System.out.println("La figura amb id " + getId() + " és un " + getFigura());
        System.out.println("L'àrea del " + getFigura() + " és: " + CalcularArea());
        System.out.println("--------------");
    }

    public double CalcularArea(){
        return 0;
    }
}