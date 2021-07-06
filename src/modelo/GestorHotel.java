/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Pareja 3
 */
public class GestorHotel {

    protected Hotel hotel;
    public static XStream xStream = null;

    public GestorHotel() {
        xStream = new XStream(new DomDriver());
        xStream.alias("hotel", Hotel.class);
        xStream.omitField(EstadoReserva.class, "timer");

        try {
            FileInputStream fileInputXml = new FileInputStream(new File("src/hotel.xml"));
            hotel = (Hotel) xStream.fromXML(fileInputXml);

            // Ya que no guarda variables estaticas en hotel definimos el struct detallesTarifas con los precios
            // y al deserializar asignamos los precios tomando el struct almacenado
            Simple.setPrecio(hotel.detallesTarifas.precioSimple);
            Doble.setPrecio(hotel.detallesTarifas.precioDoble);
            DobleMatrimonio.setPrecio(hotel.detallesTarifas.precioMatrimonio);

            if (hotel == null) {
                System.out.println("ERROR no se encuentra hotel");
                System.exit(-1);
            }
        } catch (FileNotFoundException e) {
            hotel = new Hotel();
            hotel.cargarDatos();
            realizarBackUp();
        }

    }

    public void realizarBackUp() {
        String xml = xStream.toXML(hotel);

        try {
            FileWriter fileOutputXml = new FileWriter(new File("src/hotel.xml"));
            fileOutputXml.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            fileOutputXml.write(xml);
            fileOutputXml.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Personal login(String usuario, String password) {
        return hotel.login(usuario, password);
    }

    public void salir() {
        realizarBackUp();
    }
}
