package modelo;

public class ReservaFinalizada extends EstadoReserva {

    protected Hotel hotel;

    public ReservaFinalizada(Reserva reserva, Hotel hotel) {
        super(reserva);
        this.hotel = hotel;
        hotel.addReservaFinalizada(this);
    }
}
