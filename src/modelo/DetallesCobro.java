/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Yannick Villaescusa y Noah Villaescusa
 */
public class DetallesCobro {
    public String tarjetaBancaria;
    public float importeCobro;

    public DetallesCobro(String tarjetaBancaria, float importeCobro) {
        this.tarjetaBancaria = tarjetaBancaria;
        this.importeCobro = importeCobro;
    }
}
