/**
 * Representa un pedido realizado por un cliente.
 */
public class Pedido {
    private Cliente cliente;

    /**
     * Constructor de la clase Pedido.
     *
     * @param cliente Cliente que realiza el pedido.
     */
    public Pedido(Cliente cliente) {
        this.setCliente(cliente);
    }

    /**
     * Procesa un pedido aplicando descuentos según el estado VIP del cliente.
     *
     * @param total Importe total del pedido.
     * @param esVip Indica si el cliente es VIP o no.
     */
    public void procesarPedido(double total, boolean esVip) {
        String cabeceraMensaje = "";
        double cuotaDescuento;

        if (total > 100) {
            if (esVip) {
                cuotaDescuento = 0.15;
                cabeceraMensaje = "Pedido VIP ";
            } else {
                cuotaDescuento = 0.10;
                cabeceraMensaje = "Pedido ";
            }
            double descuento = total * cuotaDescuento;
            double precioFinal = total - descuento;
            System.out.printf("%s aprobado. Total: %.2f (descuento aplicado: %.2f)%n",cabeceraMensaje,precioFinal,descuento);

        } else {
            System.out.println(cabeceraMensaje + "aprobado. Total: " + total);
        }
    }

    /**
     * Obtiene el cliente asociado al pedido.
     *
     * @return El cliente del pedido.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente para el pedido.
     *
     * @param cliente Cliente que realiza el pedido.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
