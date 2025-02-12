package es.uah.matcomp.mp.e1.ejerciciosclases.e1;

/**
 * Clase que representa un libro con ISBN, nombre, autor, precio y calidad
 */
public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    /**
     * Constructor para inicializar un libro con ISBN, nombre, autor y precio
     * @param isbn Códico ISBN del libro
     * @param name Nombre del libro
     * @param author Autor del libro
     * @param price Precio del libro
     */
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * Constructor para inicializar un libro con ISBN, nombre, autor, precio y cantidad
     * @param isbn Código ISBN del libro
     * @param name Nombre del libro
     * @param author Autor del libro
     * @param price Precio del libro
     * @param qty Cantidad de libros disponibles
     */
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    /**
     * Obtiene el ISBN del libro
     * @return ISBN del libro
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Obtiene el nombre del libro
     * @return Nombre del libro
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el autor del libro
     * @return Autor del libro
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Obtiene el precio del libro
     * @return Precio del libro
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece un nuevo precio del libro
     * @param price Nuevo precio
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Obtriene la cantidad disponible deel libro
     * @return Cantidad del libro disponible
     */
    public int getQty() {
        return qty;
    }

    /**
     * Establece una nueva cantidad de libros disponibles
     * @param qty Nueva cantidad
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * Obtiene el nombre del autor del libro
     * @return Nombre del autor
     */
    public String getAuthorName() {
        return author.getName();
    }

    /**
     * Representación en cadena del objeto Book
     * @return Cadena con los detalles del libro
     */
    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ", Author=[name=" + name + ", email=" + getAuthor().getEmail() + "], price=" + price + ", qty=" + qty + "]" ;
    }

}
