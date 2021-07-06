package modelo;

public class Doble extends Habitacion {

    public static float precio;

    public Doble(int numero) {
        super(numero);
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    public static void setPrecio(float precio) {
        Doble.precio = precio;
    }

    @Override
    public String toString() {
        String cadena;

        cadena = getNumero() + ":" + precio + ":" + this.getClass().getSimpleName();

        return cadena;
    }

}
