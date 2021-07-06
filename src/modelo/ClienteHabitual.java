package modelo;

public class ClienteHabitual extends Cliente {

    protected Descuento descuento;
    private String correo;

    public ClienteHabitual(String DNI, String nombre, String apellidos, String telefono, String direccion, Descuento descuento, String correo) {
        super(DNI, nombre, apellidos, telefono, direccion);
        this.descuento = descuento;
        this.correo = correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public int obtenerDescuento() {
        return descuento.getDescuento();
    }

    public DetallesClienteHabitual getDatosClienteHabitual() {
        DetallesClienteHabitual detallesClienteHabitual = new DetallesClienteHabitual(DNI, nombre, correo, apellidos, direccion, telefono);
        return detallesClienteHabitual;
    }
}
