package es.uah.matcomp.mp.e1.ejerciciosclases.e5;
import es.uah.matcomp.mp.e1.ejerciciosclases.e4.MyPoint;

/**
 * Atributos privados que definen la línes
 */
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    /**
     * Constructor que recibe coordenadas
     */
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    /**
     * Constructor que recibe objetos MyPoint
     */
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    /**
     *Devuelve el begin
     */
    public MyPoint getBegin() {
        return begin;
    }

    /**
     * Establece un nuevo begin
     */
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    /***
     * Devuelve el end
     */
    public MyPoint getEnd() {
        return end;
    }

    /**
     * Establece un nuevo end
     */
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    /**
     * Obtiene la coordenada x del begin
     */
    public int getBeginX() {
        return begin.getX();
    }

    /**
     * Establece una nueva coordenada x del begin
     */
    public void setBeginX(int x) {
        begin.setX(x);
    }

    /**
     * Obtiene la coordenada y del begin
     */
    public int getBeginY() {
        return begin.getY();
    }

    /**
     * Establece una nueva coordenada y del begin
     */
    public void setBeginY(int y) {
        begin.setY(y);
    }

    /**
     * Obtiene la coordenada x del end
     */
    public int getEndX() {
        return end.getX();
    }

    /**
     * Establece una nueva coordenada x del end
     */
    public void setEndX(int x) {
        end.setX(x);
    }

    /**
     * Obtiene la coordenada y del end
     */
    public int getEndY() {
        return end.getY();
    }

    /**
     * Establece una nueva coordenada y del end
     */
    public void setEndY(int y) {
        end.setY(y);
    }

    /**
     * Obtiene coordenadas simultáneas del begin
     */
    public int[] getBeginXY(){
        return begin.getXY();
    }

    /**
     * Establece nuevas coordenadas simultáneas del begin
     */
    public void setBeginXY(int x, int y){
        begin.setXY(x, y);
    }

    /**
     * Obtiene coordenadas simultáneas del end
     */
    public int[] getEndXY(){
        return end.getXY();
    }

    /**
     * Establece nuevas coordenadas simultáneas del end
     */
    public void setEndXY(int x, int y){
        end.setXY(x, y);
    }

    /**
     * Método para calcular la longitud de la línea
     */
    public double getLength(){
        return begin.distance(end);
    }

    /**
     * Método para calcular la pendiante en radianes
     */
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
    }

    /**
     * Método principal para probar la clase MyLine
     */
    @Override
    public String toString(){
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
