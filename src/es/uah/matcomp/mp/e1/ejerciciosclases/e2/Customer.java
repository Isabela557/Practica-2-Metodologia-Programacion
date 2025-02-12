package es.uah.matcomp.mp.e1.ejerciciosclases.e2;

/**
 * Clase que representa a un cliente con ID, nombre y un descuento en porcentaje
 */
public class Customer {
    private int id;
    private String name;
    private int discount;

    /**
     * Constructor para inicializar un cliente con su ID, nombre y descuento
     * @param id ID del cliente
     * @param name nombre del cliente
     * @param discount descuento que tiene el cliente
     */
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    /**
     * Devuelve el ID del cliente
     * @return ID del cliente
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del cliente
     * @return nombre del cliente
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve el descuento del cliente en porcentaje
     * @return desceunto del cliente
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * Establece un nuevo valor del descuento
     * @param discount Nuevo descuento
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * Devuelve una representación en cadena del cliente en formato "name(id)(discount%)
     * @return Cadena con los datos del cliente
     */
    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}

