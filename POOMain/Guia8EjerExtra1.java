/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.Raices;
import Service.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia8EjerExtra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // control + espacio autollenado.
        // instanciar objeto en el metodo main.
        Raices raiz = new Raices(-1, 3, 5);
        RaicesServicio raizserv = new RaicesServicio();
        
      //  System.out.println("ingrese los valores de los coeficientes a, b, c");
        //raiz.setA(sc.nextDouble());
        //raiz.setB(sc.nextDouble());
        //raiz.setC(sc.nextDouble());
        
       // System.out.println(raizserv.getDiscriminante(raiz));
        //System.out.println(raizserv.tieneRaices(raiz));
         //System.out.println(raizserv.tieneRaiz(raiz));
        
        //raizserv.obtenerRaices(raiz); 
        //raizserv.obtenerRaiz(raiz);
        System.out.println("El valor del discriminante es");
        System.out.println(raizserv.getDiscriminante(raiz));
        System.out.println("Si discriminante es negativo no hay solucion");
        raizserv.calcular(raiz);
        
    }       
    
}
