import es.uah.matcomp.mp.e1.ejerciciosclases.e3.Account;
import es.uah.matcomp.mp.e1.ejerciciosclases.e3.Customer;

/**
 * Clase principal para probar las funcionalidades de Customer y Account
 */
public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Customer customer1 = new Customer(1, "Juan Perez", 'm');

        // Crear una cuenta con saldo inicial
        Account account1 = new Account(1001, customer1, 500.0);

        // Imprimir la cuenta inicial
        System.out.println(account1);

        // Depositar dinero
        account1.deposit(200.0);
        System.out.println("después de depositar 200$: " + account1);

        // Retirar dinero dentro del saldo disponible
        account1.withdraw(100.0);
        System.out.println("Después de retirar 100$: " + account1);

        // Intentar retirar más dinero del que hay en la cuenta
        account1.withdraw(700.0);
        System.out.println("Después de retirar 700.0$: " + account1);
    }
}

