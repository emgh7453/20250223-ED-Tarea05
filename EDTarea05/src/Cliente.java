public class Cliente {
    private static boolean esVip;
    private String nombre;
    private int id;

    public Cliente(boolean vip, String nombre, int id) {
        this.setEsVip(vip);
        this.setNombre(nombre);
        this.setId(id);
    }



    public static boolean isEsVip() {
        return esVip   ;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
