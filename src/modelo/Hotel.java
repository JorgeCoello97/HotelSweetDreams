package modelo;

import java.util.*;

public class Hotel {

    protected ArrayList<ClienteHabitual> clientesHabituales;
    protected ArrayList<Personal> personal;
    protected ArrayList<Simple> simples;
    protected ArrayList<Doble> dobles;
    protected ArrayList<DobleMatrimonio> dobleMatrimonios;
    protected ArrayList<ReservaPendiente> reservasPendientes;
    protected ArrayList<ReservaOcupada> reservasOcupadas;
    protected ArrayList<ReservaCancelada> reservasCanceladas;
    protected ArrayList<ReservaFinalizada> reservasFinalizadas;
    protected Descuento descuento;
    protected DetallesTarifas detallesTarifas;

    public Hotel() {
        clientesHabituales = new ArrayList<>();
        personal = new ArrayList<>();
        simples = new ArrayList<>();
        dobles = new ArrayList<>();
        dobleMatrimonios = new ArrayList<>();
        reservasPendientes = new ArrayList<>();
        reservasOcupadas = new ArrayList<>();
        reservasCanceladas = new ArrayList<>();
        reservasFinalizadas = new ArrayList<>();

        descuento = new Descuento(10);
    }

    public Personal login(String usuario, String password) {
        Personal empleadoIdentificado = null;
        boolean usuarioCorrecto = false;

        for (int i = 0; i < personal.size(); i++) {
            Personal empleado = personal.get(i);
            usuarioCorrecto = empleado.comprobarLogin(usuario, password);
            if (usuarioCorrecto) {
                empleadoIdentificado = empleado;
                if (empleadoIdentificado.getClass() != Propietario.class) {
                    cargarReservasCaducadas();
                }
            }
        }
        return empleadoIdentificado;
    }

    public void cargarReservasCaducadas() {
        for (int indice = 0; indice < reservasPendientes.size(); indice++) {
            if (reservasPendientes.get(indice).comprobarCaducada()) {
                indice--;
            }
        }
    }

    public ClienteHabitual buscarClienteHabitual(String DNI) {
        boolean coincide = false;
        int indice = 0;
        while (indice < clientesHabituales.size() && coincide == false) {
            ClienteHabitual clienteHabitual = clientesHabituales.get(indice);
            coincide = clienteHabitual.comprobarDNI(DNI);
            if (coincide == true) {
                return clienteHabitual;
            }
            indice++;
        }
        return null;
    }

    public DetallesTarifas consultarTarifas() {
        float precioSimple = Simple.precio;
        float precioDoble = Doble.precio;
        float precioMatrimonio = DobleMatrimonio.precio;

        DetallesTarifas detallesTarifas = new DetallesTarifas(precioSimple, precioDoble, precioMatrimonio);

        return detallesTarifas;
    }

    public void modificarTarifas(DetallesTarifas precios) {
        float precioSimple = precios.precioSimple;
        float precioDoble = precios.precioDoble;
        float precioMatrimonio = precios.precioMatrimonio;

        this.detallesTarifas = precios;

        Simple.setPrecio(precioSimple);
        Doble.setPrecio(precioDoble);
        DobleMatrimonio.setPrecio(precioMatrimonio);

    }

    public ArrayList<ReservaPendiente> consultarReservasPendientes(String DNI) {
        ArrayList<ReservaPendiente> reservasPendientesUsuario = new ArrayList<>();
        for (int i = 0; i < reservasPendientes.size(); i++) {
            ReservaPendiente reservaPendiente = reservasPendientes.get(i);
            boolean coincide = reservaPendiente.comprobarDNI(DNI);

            if (coincide == true) {
                reservasPendientesUsuario.add(reservaPendiente);
            }
        }
        return reservasPendientesUsuario;
    }

    public ArrayList<ReservaOcupada> consultarReservasOcupadas(String DNI) {
        ArrayList<ReservaOcupada> reservasOcupadasUsuario = new ArrayList<>();

        for (int i = 0; i < reservasOcupadas.size(); i++) {
            ReservaOcupada reservaOcupada = reservasOcupadas.get(i);
            boolean coincide = reservaOcupada.comprobarDNI(DNI);

            if (coincide == true) {
                reservasOcupadasUsuario.add(reservaOcupada);
            }
        }

        return reservasOcupadasUsuario;
    }

    public ArrayList<Habitacion> consultarHabitacionesDisponibles(Date fecha, int numeroDias, String tipo) {
        ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();

        if (tipo.equals(Simple.class.getSimpleName())) {
            habitacionesDisponibles = consultarHabitacionesDisponiblesTipo(fecha, numeroDias, simples);
        }
        if (tipo.equals(Doble.class.getSimpleName())) {
            habitacionesDisponibles = consultarHabitacionesDisponiblesTipo(fecha, numeroDias, dobles);
        }
        if (tipo.equals(DobleMatrimonio.class.getSimpleName())) {
            habitacionesDisponibles = consultarHabitacionesDisponiblesTipo(fecha, numeroDias, dobleMatrimonios);
        }

        return habitacionesDisponibles;
    }

    public ArrayList<Habitacion> consultarHabitacionesDisponiblesTipo(Date fecha, int numeroDias, ArrayList<? extends Habitacion> listadoHabitaciones) {
        ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();

        for (int i = 0; i < listadoHabitaciones.size(); i++) {
            Habitacion habitacion = listadoHabitaciones.get(i);

            boolean disponible = habitacion.comprobarDisponibilidad(fecha, numeroDias);
            if (disponible == true) {
                habitacionesDisponibles.add(habitacion);
            }
        }

        return habitacionesDisponibles;
    }

    public void cargarDatos() {
        Recepcionista recepcionista = new Recepcionista(this, "Yannick", "1234567");
        personal.add(recepcionista);
        Supervisor supervisor = new Supervisor(this, "Ivan", "543267");
        personal.add(supervisor);
        Propietario propietario = new Propietario(this, "Jefe99", "jefe");
        personal.add(propietario);

        Simple.setPrecio((float) 230.5);
        Doble.setPrecio((float) 450);
        DobleMatrimonio.setPrecio((float) 760.5);

        detallesTarifas = new DetallesTarifas(Simple.precio, Doble.precio, DobleMatrimonio.precio);
        Simple habitacionSimple1 = new Simple(1);
        Simple habitacionSimple2 = new Simple(2);

        simples.add(habitacionSimple1);
        simples.add(habitacionSimple2);

        Doble habitacionDoble1 = new Doble(3);
        Doble habitacionDoble2 = new Doble(4);

        dobles.add(habitacionDoble1);
        dobles.add(habitacionDoble2);

        DobleMatrimonio habitacionDobleMatrimonio1 = new DobleMatrimonio(5);
        DobleMatrimonio habitacionDobleMatrimonio2 = new DobleMatrimonio(6);

        dobleMatrimonios.add(habitacionDobleMatrimonio1);
        dobleMatrimonios.add(habitacionDobleMatrimonio2);

        ClienteHabitual cliente1 = new ClienteHabitual("1234", "JORGE", "COELLO", "666666666", "calle jaja", descuento, "jorge@hotmail.com");
        ClienteHabitual cliente2 = new ClienteHabitual("4765", "IVAN", "GREGORI", "345678456", "calle ala", descuento, "ivan@gmail.com");

        clientesHabituales.add(cliente1);
        clientesHabituales.add(cliente2);

    }

    public void addReservaOcupada(ReservaOcupada reservaOcupada) {
        reservasOcupadas.add(reservaOcupada);
    }

    public void addReservaPendiente(ReservaPendiente reservaPendiente) {
        reservasPendientes.add(reservaPendiente);
    }

    public void addReservaCancelada(ReservaCancelada reservaCancelada) {
        reservasCanceladas.add(reservaCancelada);
    }

    public void addReservaFinalizada(ReservaFinalizada reservaFinalizada) {
        reservasFinalizadas.add(reservaFinalizada);
    }

    public void removeReservaPendiente(ReservaPendiente reservaPendiente) {
        reservasPendientes.remove(reservaPendiente);
    }

    public void removeReservaOcupada(ReservaOcupada reservaOcupada) {
        reservasOcupadas.remove(reservaOcupada);
    }

    public float reservarHabitacionNuevoClienteHabitualHotel(String dni, String nombre, String apellidos, String direccion, String telefono, String email,
            Habitacion habitacion, Date fecha_entrada, Date fecha_salida, String tarjetaCredito) {

        ClienteHabitual clienteHabitual = new ClienteHabitual(dni, nombre, apellidos, telefono, direccion, descuento, email);
        clientesHabituales.add(clienteHabitual);
        float importe_final = habitacion.reservarHabitacion(tarjetaCredito, fecha_entrada, fecha_salida, clienteHabitual, this);

        return importe_final;
    }

    public float reservarHabitacionNuevoClienteHotel(String dni, String nombre, String apellidos, String direccion, String telefono,
            Habitacion habitacion, Date fecha_entrada, Date fecha_salida, String tarjetaCredito, Cliente cliente) {

        float importe_final = habitacion.reservarHabitacion(tarjetaCredito, fecha_entrada, fecha_salida, cliente, this);

        return importe_final;
    }

    public float reservarHabitacion(Habitacion habitacion, String tarjetaCredito, Date fechaSeleccionadaReserva, Date fecha_salida, Cliente cliente, Hotel hotel) {
        return (habitacion.reservarHabitacion(tarjetaCredito, fechaSeleccionadaReserva, fecha_salida, cliente, hotel));
    }

}
