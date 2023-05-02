package UF4.ProjecteFigura;

public class Quadrat extends Figura{

    private int costat;

    public Quadrat(){

    }
    public Quadrat(int r){
        costat = r;
        setFigura("Quadrat");

    }

    public int getCostat() {
        return costat;
    }

    public void setQuadrat(int quadrat) {
        costat = quadrat;
    }
    @Override
    public double CalcularArea(){
        costat = (int) Math.pow(costat, 2);
        return costat;
    }
}
