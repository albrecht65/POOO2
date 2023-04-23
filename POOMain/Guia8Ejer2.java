/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.Cafetera;
import Service.CafeteraServicio;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia8Ejer2 {
    public static void main(String[] args) {
        
        Cafetera cafe = new Cafetera();
        CafeteraServicio cafeserv = new CafeteraServicio();
      
        System.out.println("Ingrese la capacidad maxima cafetera"); 
        cafeserv.llenarCafetera();

        // servir tazas
        cafeserv.servirTaza(0);

        //vaciar cafetera.
        cafeserv.vaciarCafetera();
        System.out.println("la capacidad actual de la cafetera es " + cafe.getCapacidadActual() );
    
        // llenar con cafe
        cafeserv.agregarCafe(0);
    
}   
}
