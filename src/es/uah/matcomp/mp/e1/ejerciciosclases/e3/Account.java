package es.uah.matcomp.mp.e1.ejerciciosclases.e3;

/**
 * Clase que representa una cuenta bancaria asociada a un cliente
 */
public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    /**
     * Constructo que inicializa una cuenta con un ID, cliente, saldo inicial
     * @param id ID cuenta
     * @param customer cliente cuenta
     * @param balance saldo inicial cuenta
     */
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    /**
     * Constructor que inicializa una cuenta con un ID y cliente, con saldo por defecto 0.0
     * @param id ID cuenta
     * @param customer cliente cuenta
     */
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    /**
     * Devuelve el ID de la cuenta
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el cliente asociado a la cuenta
     * @return cliente asociado a la cuenta
     */
    public Customer getCustomer() {
        return customer;
    }

    /***
     * Devuelve el saldo de la cuenta
     * @return saldo cuenta
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Establece un nuevo saldo en la cuenta
     * @param balance nuevo saldo
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * devuelve una representación en cadena de la cuenta en formato: "name(id) balance=$xxx.xx"
     */
    @Override
    public String toString() {
        return customer.toString() + "balance=$" + String.format("%.2f", balance);
    }

    /**
     * Devuelve el nombre del cliente asociado a la cuenta
     * @return nombre del cliente
     */
    public String getCustomerName() {
        return customer.getNombre();
    }

    /**
     * Agrega una cantidad al saldo de la cuenta
     */
    public Account deposit(double amount) {
        balance += amount;
        return this; // Retorna la cuenta actual para permitir encadenamiento del método
    }

    /**
     * Resta un monto del saldo de la cuenta si hay suficiente saldo disponible.
     * Si el saldo es insuficiente, imprime un mensaje de error
     */
    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

}
