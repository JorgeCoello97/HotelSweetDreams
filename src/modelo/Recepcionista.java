package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Recepcionista extends Personal {

    private Cliente clienteActual;
    private Date fechaSeleccionadaReserva;
    private Date fecha_salida;

    public Recepcionista(Hotel hotel, String usuario, String password) {
        super(hotel, usuario, password);
    }

    public ArrayList consultarHabitacionesDisponibles(Date fecha, int numeroDias, String tipo) {
        ArrayList<Habitacion> habitacionesDisponibles = hotel.consultarHabitacionesDisponibles(fecha, numeroDias, tipo);

        this.fechaSeleccionadaReserva = fecha;

        this.fecha_salida = new Date();
        this.fecha_salida.setTime(fechaSeleccionadaReserva.getTime() + (numeroDias * 86400000));
        return habitacionesDisponibles;
    }

    public DetallesClienteHabitual buscarClienteHabitual(String DNI) {
        ClienteHabitual clienteHabitual = hotel.buscarClienteHabitual(DNI);
        if (clienteHabitual != null) {
            this.clienteActual = clienteHabitual;
            DetallesClienteHabitual detallesClienteHabitual = clienteHabitual.getDatosClienteHabitual();
            return detallesClienteHabitual;
        }
        return null;
    }

    public ArrayList consultarReservasPendientes(String DNI) {
        ArrayList reservasPendientesUsuario = hotel.consultarReservasPendientes(DNI);
        return reservasPendientesUsuario;
    }

    public int realizarCheckIn(Object reservaPendiente) {
        int numeroHabitacion = ((ReservaPendiente) reservaPendiente).realizarCheckIn();
        
        return numeroHabitacion;
    }

    public ArrayList consultarReservasOcupadas(String DNI) {
        ArrayList reservasOcupadasUsuario = hotel.consultarReservasOcupadas(DNI);
        return reservasOcupadasUsuario;
    }

    public DetallesCobro realizarCheckOut(Object reservaOcupada) {
        return ((ReservaOcupada) reservaOcupada).realizarCheckOut();
    }

    public DetallesCobro cancelarReserva(Object estado) {
        return ((ReservaPendiente) estado).cancelarReserva();
    }

    public float reservarHabitacionClienteHabitual(Object habitacion, String tarjetaCredito) {
        ClienteHabitual clienteHabitual = (ClienteHabitual) clienteActual;
        float importe_final = hotel.reservarHabitacion((Habitacion) habitacion, tarjetaCredito, fechaSeleccionadaReserva, fecha_salida, clienteHabitual, hotel);
        return importe_final;
    }

    public float reservarHabitacionNuevoClienteHabitual(Object habitacion, String tarjetaCredito, String dni, String nombre, String apellidos, String direccion, String telefono, String email) {
        float importe_final = hotel.reservarHabitacionNuevoClienteHabitualHotel(dni, nombre, apellidos, direccion, telefono, email,
                (Habitacion) habitacion, fechaSeleccionadaReserva, fecha_salida, tarjetaCredito);
        return importe_final;
    }

    public float reservarHabitacionCliente(Object habitacion, String tarjetaCredito, String dni, String nombre, String apellidos, String direccion, String telefono) {
        clienteActual = new Cliente(dni, nombre, apellidos, telefono, direccion);
        float importe_final = hotel.reservarHabitacionNuevoClienteHotel(dni, nombre, apellidos, direccion, telefono,
                (Habitacion) habitacion, fechaSeleccionadaReserva, fecha_salida, tarjetaCredito, clienteActual);
        return importe_final;
    }

}
