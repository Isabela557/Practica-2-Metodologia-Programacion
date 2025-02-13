import es.uah.matcomp.mp.e1.ejerciciosclases.e6.MyCircle;
import es.uah.matcomp.mp.e1.ejerciciosclases.e4.MyPoint;

public class Main {
    public static void main(String[] args) {

        //Crear instancias de MyCircle usando diferentes constructores
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(3,4,5);
        MyPoint p1 = new MyPoint(7,8);
        MyCircle c3 = new MyCircle(p1, 10);

        //Imprimir los círculos
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        //Probar getters y setters
        c1.setRadius(2);
        c1.setCenterXY(1,1);
        System.out.println(c1.toString());

        //Probar métodos de cálculo
        System.out.println("Área de c2:" + c2.getArea());
        System.out.println(("Circunferencia de c3: " + c3.getCircumference()));

        //Probar distancia entre los centros de c1 y c2
        System.out.println("Distancia entre c1 y c2: " + c1.distance(c2));

        //Probar métodos de MyPoint a través de MyCircle
        System.out.println("Centro de c3: " + c3.getCenter());
        System.out.println("Coordenada X del centro de c3: " + c3.getCenterX());
        System.out.println("Coordenada Y del centro de c1: " + c3.getCenterY());
    }
}


