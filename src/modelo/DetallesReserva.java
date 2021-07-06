package modelo;

import java.util.Date;

public class DetallesReserva {

    private float importe;
    private Date fech_ent;
    private int num_dias;
    private String DNI;
    private String nombre;
    private String telefono;
    private String direccion;

    public DetallesReserva(float importe, Date fech_ent, int num_dias, String DNI, String nombre, String telefono, String direccion) {
        this.importe = importe;
        this.fech_ent = fech_ent;
        this.num_dias = num_dias;
        this.DNI = DNI;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Date getFech_ent() {
        return fech_ent;
    }

    public void setFech_ent(Date fech_ent) {
        this.fech_ent = fech_ent;
    }

    public int getNum_dias() {
        return num_dias;
    }

    public void setNum_dias(int num_dias) {
        this.num_dias = num_dias;
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

}
