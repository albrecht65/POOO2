/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.Fecha;
import Service.FechaService;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia8Ejer4ExtraBis {
    public static void main(String[] args) {
        Fecha f = new Fecha();
        FechaService fs = new FechaService();
        
       fs.ingresoFecha(f);
    }
}
