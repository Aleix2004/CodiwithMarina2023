package UF4.Agenda;

public class Pagina {
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    int dia;

    int mes;

    public Pagina(){}

    public void afegirCita(Cita c){

    }

    public void borrarCita(Cita c){

    }

    public Cita cercarCita(String titol){
        Cita c = new Cita();
        return c;
    }
}



