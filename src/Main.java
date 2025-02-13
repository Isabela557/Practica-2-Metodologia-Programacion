import es.uah.matcomp.mp.e1.ejerciciosclases.e5.MyLine;
import es.uah.matcomp.mp.e1.ejerciciosclases.e4.MyPoint;

public class Main {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);
        MyLine line1 = new MyLine(p1, p2);

        System.out.println(line1); // Prueba de toString
        System.out.println("Longitud de la línea: " + line1.getLength());
        System.out.println("Gradiente de la línea: " + line1.getGradient());


    }
}


