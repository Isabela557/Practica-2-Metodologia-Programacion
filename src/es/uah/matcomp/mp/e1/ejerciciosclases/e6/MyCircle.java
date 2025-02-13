package es.uah.matcomp.mp.e1.ejerciciosclases.e6;
import es.uah.matcomp.mp.e1.ejerciciosclases.e4.MyPoint;

/**
 * Atributos privados que definen el circulo
 */
public class MyCircle {
    // Atributos privados
    private MyPoint center; // (0,0)
    private int radius = 1;

    /**
     * Constructor por defecto (0,0)
     */
    public MyCircle(){
        this.center = new MyPoint();
    }

    /**
     * Constructor con coordenadas y radio
     */
    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    /**
     * Constructor con MyPoint y radio
     */
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    /**
     * Devuelve el radio
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Establece un nuevo radio
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Devuelve el centro del círculo
     */
    public MyPoint getCenter() {
        return center;
    }

    /**
     * Establece un nuevo centro del círculo
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    /**
     * Devuelve la coordenada x del centro del círculo
     */
    public int getCenterX() {
        return center.getX();
    }

    /**
     * Establece una nueva coordenada x del centro del círculo
     */
    public void setCenterX(int x) {
        this.center.setX(x);
    }

    /**
     * Devuelve la coordenada y del centro del circulo
     */
    public int getCenterY() {
        return center.getY();
    }

    /**
     * Establece una nueva coordenada y del centro del circulo
     */
    public void setCenterY(int y) {
        this.center.setY(y);
    }

    /**
     * Devuelve las coordenadas del centro simultáneamente
     * @return
     */
    public int[] getCenterXY(){
        return center.getXY();
    }

    /**
     * Establece nuevas coordenadas simultáneamente
     */
    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }
    /**
     * Método toString para representar el círculo como texto
     */
    @Override
    public String toString(){
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }

    /**
     * Método para calcular el área del círculo
     */
    public double getArea(){
        return radius * radius * Math.PI;
    }

    /**
     * Método para calcular la circuenferencia del círculo
     */
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    /**
     * Método para calcular la distancia entre los centros de dos círculos
     */
    public double distance(MyCircle another){
        return this.center.distance(another.getCenter());
    }
}
