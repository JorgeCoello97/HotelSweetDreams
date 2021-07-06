package modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    protected EstadoReserva estado;
    protected Habitacion habitacion;
    protected Cliente cliente;
    private Date fechaEntrada;
    private Date fechaSalida;
    private int NumDias;
    private float importe;
    private String cuentaBancaria;

    public Reserva(Habitacion habitacion, float precio, String tarjetaCredito, Date fecha_entrada, Date fecha_salida, Cliente cliente, Hotel hotel) {
        this.habitacion = habitacion;
        this.cuentaBancaria = tarjetaCredito;

        /* PRUEBAS PARA PROBAR EL PATRON PUBLICAR - SUSCRIBIR
        fecha_ent = new Date();
        this.fecha_ent.setTime(fecha_ent.getTime() + 60000);
         */
        this.fechaEntrada = fecha_entrada;
        this.fechaSalida = fecha_salida;
        this.cliente = cliente;

        long diff = fechaSalida.getTime() - fechaEntrada.getTime();
        this.NumDias = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        ReservaPendiente reservaPendiente = new ReservaPendiente(this, hotel);

        int descuento = 0;
        if (cliente.getClass() == ClienteHabitual.class) {
            descuento = ((ClienteHabitual) cliente).obtenerDescuento();
        }
        this.importe = (float) (precio * ((100 - descuento) / 100.0));
        habitacion.addReserva(this);
        cliente.addReserva(this);
    }

    public boolean comprobarDNI(String DNI) {
        boolean coincide = cliente.comprobarDNI(DNI);
        return coincide;
    }

    public DetallesCobro eliminarDatos() {
        float importeCobro = 0;
        DetallesCobro detalles;
        if (fechaEntrada.getTime() - System.currentTimeMillis() <= 172800000) {
            importeCobro = (this.importe / NumDias);
        }
        if (cliente.getClass() == Cliente.class) {
            borrarCliente();
        }

        detalles = new DetallesCobro(cuentaBancaria, importeCobro);

        borrarCuentaBancaria();

        return detalles;
    }

    public void borrarCuentaBancaria() {
        this.cuentaBancaria = null;
    }

    public void borrarCliente() {
        this.cliente = null;
    }

    //SETTERS Y GETTERS
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setCuentaBancaria(String cuenta_bancaria) {
        this.cuentaBancaria = cuenta_bancaria;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getImporte() {
        return importe;
    }

    public void setFechaEntrada(Date fecha_ent) {
        this.fechaEntrada = fecha_ent;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setNumDias(int num_dias) {
        this.NumDias = num_dias;
    }

    public int getNumDias() {
        return NumDias;
    }

    public boolean consultarDisponibilidad(Date fecha, int numeroDias) {
        return estado.consultarDisponibilidad(fecha, numeroDias);
    }

    public boolean comprobarReserva(Date fecha, int numeroDias) {
        boolean disponible = true;

        Calendar c = Calendar.getInstance();
        c.setTime(fechaEntrada);
        c.add(Calendar.DATE, NumDias);
        Date fechaFinalReserva = c.getTime();

        Calendar c1 = Calendar.getInstance();
        c1.setTime(fecha);
        c1.add(Calendar.DATE, numeroDias);
        Date fechaFinalSolic = c1.getTime();


        /*Si la fecha de entrada es igual a la fecha solicitada
        o si la fecha solicitada esta entre el inicio y final de las fechas de una reserva
        o si la fecha final de la fecha solicitada esta entre el inicio y final de las fechas de una reserva*/
        if (fechaEntrada.compareTo(fecha) == 0
                || (fecha.after(fechaEntrada) && fecha.before(fechaFinalReserva))
                || (fechaFinalSolic.after(fechaEntrada) && fechaFinalSolic.before(fechaFinalReserva))) {
            disponible = false;
        }
        return disponible;
    }

    public void consultarDetallesReserva() {
        this.importe = this.importe / NumDias;
        String dni = cliente.getDNI();
        String nombre = cliente.getNombre();
        String telefono = cliente.getTelefono();
        String direccion = cliente.getDireccion();
        DetallesReserva detallesReserva = new DetallesReserva(importe, fechaEntrada, NumDias, dni, nombre, telefono, direccion);
        GestorEventos gestorEventos = GestorEventos.getInstance();
        gestorEventos.publicar("AVISO_RESERVA_PENDIENTE", detallesReserva);
    }
}
