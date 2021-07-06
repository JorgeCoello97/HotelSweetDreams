package modelo;

public class ReservaCancelada extends EstadoReserva {

    protected Hotel hotel;

    public ReservaCancelada(Reserva reserva, Hotel hotel) {
        super(reserva);
        this.hotel = hotel;
        hotel.addReservaCancelada(this);
    }
}
