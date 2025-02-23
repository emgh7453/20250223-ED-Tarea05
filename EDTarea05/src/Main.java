/**
 * Clase principal que ejecuta la aplicación.
 */
public class Main {
    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Crea un pedido para un cliente no VIP
        Pedido pedido1 = new Pedido(new Cliente(false, "Juan", 1));
        pedido1.procesarPedido(101, Cliente.isEsVip());

        // Crea un pedido para un cliente VIP
        Pedido pedido2 = new Pedido(new Cliente(true, "Juan de todos los santos", 2));
        pedido2.procesarPedido(101, Cliente.isEsVip());

        // Convierte al cliente 1 en VIP y procesa un nuevo pedido de 1000 €
        pedido1.getCliente().setEsVip(true);
        pedido1.procesarPedido(1000.00, true);
    }

}
