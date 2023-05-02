package UF4.ProjecteFigura;

public class Cercle extends Figura{

    private int radi;

    public Cercle(){

    }

    public Cercle(int r){

        radi = r;
        setFigura("Cercle");
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }
    @Override
    public double CalcularArea(){
        radi = (int) (Math.pow(radi, 2) * Math.PI);
        return radi;
    }

}
