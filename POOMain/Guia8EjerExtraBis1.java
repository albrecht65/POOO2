/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.Fraccion;
import Service.FraccionService;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia8EjerExtraBis1 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         
         FraccionService fs = new FraccionService();
         Fraccion f1 = new Fraccion();
       
         
         System.out.println("ingrese numerador1");
         f1.setNumerador1(sc.nextDouble());
         System.out.println("ingrese denominador1");
         f1.setDenominador1(sc.nextDouble());
         System.out.println("ingrese numerador2");
         f1.setNumerador2(sc.nextDouble());
         System.out.println("ingrese denominador2");
         f1.setDenominador2(sc.nextDouble());
    
        fs.mostrar(f1);
         
         
    }
}

