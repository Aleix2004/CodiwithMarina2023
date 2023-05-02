package UF4.Agenda;

public class Agenda {
    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }


    public void avanzarPagina(){}

    public void retrocedirPagina(){}

    public Pagina llegirPagina(){
        Pagina p = new Pagina();
        return p;
    }

    int any;    

    public Agenda(){}
}
