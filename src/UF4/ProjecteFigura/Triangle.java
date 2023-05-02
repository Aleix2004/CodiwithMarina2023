package UF4.ProjecteFigura;

import java.security.PublicKey;

public class Triangle extends Figura {

    private int base;

    private int h;

    public Triangle(){
        
    }

    public Triangle(int b, int a){
        base = b;
        h = a;
        setFigura("Triangle");
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double CalcularArea() {
        //hacer el calculo del area
        h = (base*h)/2;
        return h;
    }

}
