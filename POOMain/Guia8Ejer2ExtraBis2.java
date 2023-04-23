/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.Tiempo;
import Service.TiempoService;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia8Ejer2ExtraBis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tiempo t = new Tiempo();
        TiempoService ts = new TiempoService();
        
       System.out.println("Ingrese la hora");
        t.setHora(sc.nextInt());
       System.out.println("Ingrse los minutos");
        t.setMin(sc.nextInt());
        System.out.println("Ingrese los segundos");
        t.setSegundos(sc.nextInt());
       
        ts.imprimirHoraCompleta(t);
        
    }
}
