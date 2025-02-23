/**
 * Representa un cliente con un identificador, nombre y estado VIP.
 */
public class Cliente {
    private static boolean esVip;
    private String nombre;
    private int id;

    /**
     * Constructor de la clase Cliente.
     *
     * @param vip   Indica si el cliente es VIP.
     * @param nombre Nombre del cliente.
     * @param id    Identificador único del cliente.
     */
    public Cliente(boolean vip, String nombre, int id) {
        this.setEsVip(vip);
        this.setNombre(nombre);
        this.setId(id);
    }

    /**
     * Verifica si el cliente es VIP.
     *
     * @return {@code true} si el cliente es VIP, {@code false} en caso contrario.
     */
    public static boolean isEsVip() {
        return esVip;
    }

    /**
     * Establece el estado VIP del cliente.
     *
     * @param esVip {@code true} para marcar como VIP, {@code false} en caso contrario.
     */
    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador único del cliente.
     *
     * @return El ID del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del cliente.
     *
     * @param id El ID del cliente.
     */
    public void setId(int id) {
        this.id = id;
    }
}
