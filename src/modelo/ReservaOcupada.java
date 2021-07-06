package modelo;

import java.util.Date;

public class ReservaOcupada extends EstadoReserva {

    protected Hotel hotel;

    public ReservaOcupada(Reserva reserva, Hotel hotel) {
        super(reserva);
        this.hotel = hotel;
        hotel.addReservaOcupada(this);
    }

    @Override
    public DetallesCobro realizarCheckOut() {
        float importe;
        DetallesCobro detalles;
        
        importe = reserva.getImporte();
        
        detalles = new DetallesCobro(reserva.getCuentaBancaria(), importe);
        
        reserva.borrarCliente();
        reserva.borrarCuentaBancaria();
        hotel.removeReservaOcupada(this);
        ReservaFinalizada reservaFinalizada = new ReservaFinalizada(reserva, hotel);

        return detalles;
    }

    @Override
    public boolean comprobarDNI(String DNI) {
        boolean coincide = reserva.comprobarDNI(DNI);
        return coincide;
    }

    @Override
    public boolean consultarDisponibilidad(Date fecha, int numeroDias) {
        return reserva.comprobarReserva(fecha, numeroDias);
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena += reserva.getHabitacion().getNumero();
        cadena += ":" + reserva.getCliente().getDNI();
        cadena += ":" + reserva.getCliente().getNombre();
        cadena += ":" + reserva.getNumDias();
        cadena += ":" + reserva.getImporte();
        cadena += ":OCUPADA";
        return cadena;
    }
}
