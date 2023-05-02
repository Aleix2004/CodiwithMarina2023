package UF4.ProjecteFigura;

public class Trapezi extends Figura{

    private int a;
    private int b;
    private int c;

    public Trapezi(){

    }

    public Trapezi(int a, int b, int h){
        this.a = a;
        this.b = b;
        c = h;
        setFigura("Trapezi");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double CalcularArea(){


        this.c = ((this.a * this.b)*this.c)/2;
        return this.c;
    }
}
