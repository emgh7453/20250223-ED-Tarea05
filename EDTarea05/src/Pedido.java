public class Pedido {
    private Cliente cliente;
    public Pedido(Cliente cliente) {
        this.setCliente(cliente);
    }

    public void procesarPedido(double total,boolean esVip) {
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
            System.out.println(cabeceraMensaje + "aprobado. Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
        } else {
            System.out.println(cabeceraMensaje + "aprobado. Total: " + total);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



}
