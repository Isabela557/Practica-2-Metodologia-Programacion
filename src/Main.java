import es.uah.matcomp.mp.e1.ejerciciosclases.e7.MyTriangle;
import es.uah.matcomp.mp.e1.ejerciciosclases.e4.MyPoint;

public class Main {
    public static void main(String[] args) {
        // Crear puntos
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(4,0);
        MyPoint p3 = new MyPoint(4,3);

        // Crear triángulo usando puntos
        MyTriangle t1 = new MyTriangle(p1,p2,p3);
        System.out.println(t1.toString());
        System.out.println("Perímetro: " + t1.getPerimeter());
        System.out.println(("Tipo: " + t1.getType()));

        //Crear otro triángulo usando coordenadas
        MyTriangle t2 = new MyTriangle(0,0,3,0,1,2);
        System.out.println(t2.toString());
        System.out.println("Perimetro: " + t2.getPerimeter());
        System.out.println(("Tipo: " + t2.getType()));
    }
}


