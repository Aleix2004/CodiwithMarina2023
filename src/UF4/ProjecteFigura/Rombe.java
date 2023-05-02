package UF4.ProjecteFigura;

public class Rombe extends Figura{
    private int dM;
    private int dm;

    public Rombe(){

    }

    public Rombe(int dM, int dm){
        this.dM = dM;
        this.dm = dm;
        setFigura("Rombe");
    }

    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }
    @Override
    public double CalcularArea(){


        this.dM = (this.dM * this.dm)/2;
        return this.dM;
    }
}
