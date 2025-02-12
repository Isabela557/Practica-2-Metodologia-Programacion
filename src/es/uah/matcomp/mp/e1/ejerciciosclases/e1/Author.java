package es.uah.matcomp.mp.e1.ejerciciosclases.e1;

/**
 * Clase que representa un autor con nombre y correo electrónico
 */
public class Author {
    private String name;
    private String email;

    /**
     * Constructor para inicializar un autor con nombre y correo electrónico
     * @param name Nombre del autor
     * @param email Correo electrónico del autor
     */
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Obtiene el nombre del autor
     * @return Nombre del autor
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el correo electrónico del autor
     * @return Correo electrónico del autor
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece un nuevo correo electrónico para el autor
     * @param email Nuevo correo electrónico
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Representación en cadena del objeto Author
     * @return Cadena con los detalles del autor
     */
    @Override
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ']';
    }
}

