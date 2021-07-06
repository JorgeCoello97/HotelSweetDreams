package modelo;

import java.util.ArrayList;
import java.util.Date;

public abstract class Habitacion {

    protected ArrayList<Reserva> reservas;
    private int numero;

    public Habitacion(int numero) {
        this.numero = numero;
        this.reservas = new ArrayList<>();
    }

    public boolean comprobarDisponibilidad(Date fecha, int numeroDias) {
        boolean habitacionDisponible = true;
        if (!reservas.isEmpty()) {
            int indexReserva = 0;

            while ((habitacionDisponible) && (reservas.size() > indexReserva)) {
                Reserva reserva = reservas.get(indexReserva);
                boolean disponible = reserva.consultarDisponibilidad(fecha, numeroDias);
                habitacionDisponible = disponible;

                indexReserva++;
            }
        }
        return habitacionDisponible;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    abstract public float getPrecio();

    public float reservarHabitacion(String tarjetaCredito, Date fecha_entrada, Date fecha_salida, Cliente cliente, Hotel hotel) {
        Reserva reserva = new Reserva(this, this.getPrecio(), tarjetaCredito, fecha_entrada, fecha_salida, cliente, hotel);
        float importe = reserva.getImporte();
        return importe;
    }
}
