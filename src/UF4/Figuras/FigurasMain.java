package UF4.Figuras;

import UF2.CercaValors.CercaValors;

import java.awt.*;

public class FigurasMain {

    /**
     *
     * @param args
     * la linea 15 li dic al primer rectangle que sigui de color blau
     * la linea 27 li dic que la base val 5 y la alçada val 3 y es de color verd
     */
    public static void main(String[] args) {
        rectangle r1 = new rectangle("blau");




        //rectangle r2 = new rectangle();

        //r2.base = 5;
        //r2.alçada = 3;
        //r2.color = "verd";

        rectangle r2 = new rectangle(5,3);
        r2.color = "verd";


        /*rectangle r3 = new rectangle();

        r3.base = 6;
        r3.alçada = 4;
        r3.color = "rosa";*/

        rectangle r3 = new rectangle("rosa", 6,4);

        Quadrat q1 = new Quadrat(3, "vermell");

        Triangle t1 = new Triangle(4);


        t1.color = "verd";

        Triangle t2 = new Triangle(4);

        t2.color = "verd";

        Triangle t3 = new Triangle(3);

        t3.color = "verd";

        cercle c1 = new cercle(2.5, "blau");

    }
}
