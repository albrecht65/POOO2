/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author gabrielaalbrecht
 */
public class Cafetera {
    private double capacidadMáxima;
    private double capacidadActual;

    public Cafetera() {
    }
    // asigne 2000 cm3 a la capacidad actual
    public Cafetera(double capacidadMáxima, double capacidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.capacidadActual = capacidadActual;
    }

   

    public double getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(double capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

}
