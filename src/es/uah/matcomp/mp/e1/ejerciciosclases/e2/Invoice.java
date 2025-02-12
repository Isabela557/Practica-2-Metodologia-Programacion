package es.uah.matcomp.mp.e1.ejerciciosclases.e2;

/**
 * Clase que representa una factura con un ID, un cliente y cantidad total
 */
public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    /**
     * Constructor que inicializa una factura con un ID, cliente y cantidad
     * @param id ID de la factura
     * @param customer cliente de la factura
     * @param amount Cantidad total de la factura
     */
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    /**
     * Devuelve el ID de la factura
     * @return ID factura
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el cliente asociado a la factura
     * @return cliente de la factura
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Establece un nuevo cliente en la factura
     * @param customer Nuevo cliente
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Devuelve la cantidad total de la factura
     * @return cantidad total
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Establece una nueva cantidad en la factura
     * @param amount nueva cantidad
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Devuelve el ID del cliente asociado a la factura
     * @return ID del cliente
     */
    public int getCustomerId() {
        return customer.getId();
    }

    /**
     * Devuelve el nombre del cliente asociado a la factura
     * @return nombre del cliente
     */
    public String getCustomerName() {
        return customer.getName();
    }

    /**
     * Devuelve el descuento del cliente asociado a la factura
     * @return descuento del cliente
     */
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    /**
     * Calcula y devuelve la cantidad a pagar después de aplicar el descuento del cliente
     * @return Cantidad a pagar después del descuento
     */
    public double getAmountAfterDiscount(){
        return amount - (amount * customer.getDiscount() / 100.0);
    }

    /**
     * Devuelve una representación en cadena de la factura en formato "Invoice[id=?, customer=name(id)(discount%), amount=?]"
     * @return representación de la factura
     */
    public String toString() {
        return "Invoice [id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
    }

}
