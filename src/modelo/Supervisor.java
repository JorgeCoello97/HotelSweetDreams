package modelo;

public class Supervisor extends Recepcionista {

    public Supervisor(Hotel hotel, String usuario, String password) {
        super(hotel, usuario, password);
    }

    public DetallesTarifas consultarTarifas() {
        return hotel.consultarTarifas();
    }

    public void modificarTarifas(DetallesTarifas precios) {
        hotel.modificarTarifas(precios);
    }
}
