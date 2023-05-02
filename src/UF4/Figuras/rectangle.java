package UF4.Figuras;

public class rectangle {

    public int base;
    public int alçada;
    public String color;

    public rectangle(){}

    public rectangle(int b, int a){
        b = base;
        a = alçada;
    }

    public rectangle(String c){
        c = color;
    }

    public rectangle(String c, int b, int a){
        c = color;
        b = base;
        a = alçada;

    }
}
