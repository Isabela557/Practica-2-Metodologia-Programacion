package es.uah.matcomp.mp.e1.ejerciciosclases.e4;

import org.w3c.dom.ls.LSOutput;

/**
 * Atributos privados de la clase
 */
public class Mypoint10 {
    private int x;
    private int y;

    /**
     * Constructor que inicializa el punto en (0,0)
     */
    public Mypoint10(){
    }

    /**
     * Constructor que recibe coordenadas
     */
    public Mypoint10(int x, int y) {
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
    public double distance(Mypoint10 another){
        return distance(another.x, another.y);
    }

    /**
     * Método para calcular la distancia desde este punto al origen (0,0)
     */
    public double distance(){
        return distance(0,0);
    }

    /**
     * Método principal para pruebas
     */
    public static void main(String[] args) {
        // Crear un array de 10 puntos Mypoint10 inicializados como (1,1), (2,2), ... (10,10)
        Mypoint10[] points = new Mypoint10[10];
        for (int i = 0; i < 10; i++){
            points[i] = new Mypoint10(i +1, i +1);
        }
        // Mostrar la matrix de distancias entre todos los puntos
        System.out.println("Matriz de distancias entre todos los puntos");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                System.out.printf("%.2f\t", points[i].distance(points[j]));
            }
            System.out.println();
        }
    }


}


