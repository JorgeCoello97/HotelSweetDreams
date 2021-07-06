package modelo;

import java.util.Date;
import java.util.Timer;

public class ReservaPendiente extends EstadoReserva {

    protected Hotel hotel;

    public ReservaPendiente(Reserva reserva, Hotel hotel) {
        super(reserva);
        this.hotel = hotel;
        hotel.addReservaPendiente(this);

        Date fechaEntrada = reserva.getFechaEntrada();
        timer = new Timer();
        timer.schedule(this, fechaEntrada);
    }

    @Override
    public boolean comprobarDNI(String DNI) {
        boolean coincide = reserva.comprobarDNI(DNI);
        return coincide;
    }

    @Override
    public int realizarCheckIn() {
        if (timer != null) {
            timer.cancel();
        }
        hotel.removeReservaPendiente(this);
        
        ReservaOcupada reservaOcupada = new ReservaOcupada(reserva, hotel);
        
        Habitacion habitacion = reserva.getHabitacion();
        
        int numeroHabitacion = habitacion.getNumero();

        return numeroHabitacion;
    }

    @Override
    public DetallesCobro cancelarReserva() {
        DetallesCobro detalles;

        if (timer != null) {
            timer.cancel();
        }

        ReservaCancelada nuevoEstado = new ReservaCancelada(reserva, hotel);
        detalles = reserva.eliminarDatos();
        hotel.removeReservaPendiente(this);

        return detalles;
    }

    @Override
    public boolean consultarDisponibilidad(Date fecha, int numeroDias) {
        return reserva.comprobarReserva(fecha, numeroDias);
    }

    public void cargarReserva() {
        if (timer != null) {
            timer.cancel();
        }
        hotel.removeReservaPendiente(this);
        ReservaCancelada reservaCancelada = new ReservaCancelada(reserva, hotel);
        reserva.consultarDetallesReserva();
    }

    @Override
    public void run() {
        cargarReserva();
    }

    public boolean comprobarCaducada() {
        boolean caducada = false;
        Date fecha = new Date();
        if (fecha.after(reserva.getFechaEntrada())) {
            cargarReserva();
            caducada = true;
        }

        return caducada;
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena += reserva.getHabitacion().getNumero();
        cadena += ":" + reserva.getCliente().getDNI();
        cadena += ":" + reserva.getCliente().getNombre();
        cadena += ":" + reserva.getNumDias();
        cadena += ":" + reserva.getImporte();
        cadena += ":PENDIENTE";
        return cadena;
    }
}
