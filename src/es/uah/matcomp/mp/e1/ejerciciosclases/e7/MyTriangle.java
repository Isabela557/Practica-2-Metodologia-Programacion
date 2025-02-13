package es.uah.matcomp.mp.e1.ejerciciosclases.e7;
import es.uah.matcomp.mp.e1.ejerciciosclases.e4.MyPoint;

/**
 * Clase MyTriangle para representar un triángulo usando tres puntos
 */
    public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    /**
     * Constructor con coordenadas individuales
     */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    /**
     * Constructor con objetos MyPoint
     */
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /**
     * Método toString para mostrar el tiángulo como texto
     */
    @Override
    public String toString() {
        return "MyTriangle=[" + v1.getX() + "," + v1.getY() + "," + v2.getX() + "," + v2.getY() + "," + v3.getX() + "," + v3.getY() + "]";
    }

    /**
     * Método para calcular el perímetro del tiángulo
     */
    public double getPerimeter(){
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        return d1 + d2 + d3;
    }

    /**
     * Método para obtener el tipo de triángulo
     */
    public String getType(){
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        // Comparar las longitudes de los lados
        if (d1 == d2 && d2 == d3){
            return "Equilátero";
        } else if (d1 == d2 || d2 == d3 || d3 == d1){
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}
