package es.uah.matcomp.mp.e1.ejerciciosclases.e4;

/**
 * Clase que representa un punto
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;

    /**
     * Constructor que inicializa el punto en (0,0)
     */
    public MyPoint(){
    }

    /**
     * Constructor que recibe coordenadas
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Devuelve la coordenada x del punto
     * @return coordenada x
     */
    public int getX() {
        return x;
    }

    /**
     * Establece un nuevo valor para el punto x
     * @param x nuevo x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Devuelve la coordenada y del punto
     * @return coordenada y
     */
    public int getY() {
        return y;
    }

    /**
     * Establece un nuevo valor para el y
     * @param y nuevo y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Método para obtener un array con las coordenadas del punto
     */
    public int[] getXY(){
        return new int[]{x, y};
    }

    /**
     * Método para establecer ambos valores de coordenadas a la vez
     */
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
    * Método tostring que devuelve la representación del punto como "(x,y)"
     */
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    /**
     * Método para calcular la distancia desde ese punto a otro punto dado
     */
    public double distance(int x, int y){
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Método para calcular la distancia entre ese punto y otra instancia de MyPoint
     */
    public double distance(MyPoint another){
        return distance(another.x, another.y);
    }

    /**
     * Método para calcular la distancia desde este punto al origen (0,0)
     */
    public double distance(){
        return distance(0,0);
    }
}
