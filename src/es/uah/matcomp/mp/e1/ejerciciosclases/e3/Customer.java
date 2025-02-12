package es.uah.matcomp.mp.e1.ejerciciosclases.e3;

/**
 * Clase que representa un cliente con ID, nombre y género
 */
public class Customer {
    private int id;
    private String nombre;
    private char gender; // 'm' o 'f'

    /**
     * Constructor para inicializar un cliente con su ID, nombre y genero
     * @param id ID del cliente
     * @param nombre nombre del cliente
     * @param gender genero
     */
    public Customer(int id, String nombre, char gender) {
        this.id = id;
        this.nombre = nombre;
        this.gender = gender;
    }

    /**
     * Devuelve el ID del cliente
     * @return Id cliente
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve nombre del cliente
     * @return nombre cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el género del cliente
     * @return género cliente
     */
    public char getGender() {
        return gender;
    }

    /**
     * Devuelve una representación en cadena del cliente en el formato "name(id)"
     * @return representación del cliente
     */
    @Override
    public String toString() {
        return nombre + "(" + id + ")";
    }
}
