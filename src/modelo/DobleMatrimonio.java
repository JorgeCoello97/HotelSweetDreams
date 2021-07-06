package modelo;

public class DobleMatrimonio extends Habitacion {

    public static float precio;

    public DobleMatrimonio(int numero) {
        super(numero);
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    public static void setPrecio(float precio) {
        DobleMatrimonio.precio = precio;
    }

    @Override
    public String toString() {
        String cadena;

        cadena = getNumero() + ":" + precio + ":" + this.getClass().getSimpleName();

        return cadena;
    }

}
