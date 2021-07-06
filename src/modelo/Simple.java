package modelo;

public class Simple extends Habitacion {

    public static float precio;

    public Simple(int numero) {
        super(numero);
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    public static void setPrecio(float precio) {
        Simple.precio = precio;
    }

    @Override
    public String toString() {
        String cadena;

        cadena = getNumero() + ":" + precio + ":" + this.getClass().getSimpleName();

        return cadena;
    }
}
