package modelo;

public class DetallesClienteHabitual {

    public String DNI;
    public String nombre;
    public String correo;
    public String apellidos;
    public String telefono;
    public String direccion;

    public DetallesClienteHabitual(String DNI, String nombre, String correo, String apellidos, String direccion, String telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.correo = correo;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
