package modelo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public abstract class EstadoReserva extends TimerTask {

    protected Reserva reserva;
    protected Timer timer;

    public EstadoReserva(Reserva reserva) {
        this.reserva = reserva;
        reserva.setEstado(this);
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public boolean comprobarDNI(String _dNI) {
        return false;
    }

    public int realizarCheckIn() {
        return 0;
    }

    public DetallesCobro cancelarReserva() {
        return new DetallesCobro("", 0);
    }

    public DetallesCobro realizarCheckOut() {
        return new DetallesCobro("", 0);
    }

    public boolean consultarDisponibilidad(Date fecha, int numeroDias) {
        return true;
    }

    @Override
    public void run() {
    }
}
