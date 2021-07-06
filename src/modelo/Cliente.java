package modelo;

import java.util.*;

public class Cliente {

    protected ArrayList<Reserva> reservas;
    protected String DNI;
    protected String nombre;
    protected String apellidos;
    protected String telefono;
    protected String direccion;
    
    public Cliente(String DNI, String nombre, String apellidos, String telefono, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.reservas = new ArrayList<>();
    }

    
    public boolean comprobarDNI(String DNI) {
        boolean coincide = (this.DNI.equalsIgnoreCase(DNI));
        return coincide;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
}
