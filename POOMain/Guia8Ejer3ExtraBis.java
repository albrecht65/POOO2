/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.Pass;
import Service.PassService;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia8Ejer3ExtraBis {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int opciones; 
        
        Pass p = new Pass();
        
        PassService ps = new PassService();
        
        do {
            System.out.println("Ingrese al menu de opciones: 1. ingresar la contraseña;"
                + " 2.Analizar contrasenia; 3. Modificar Nombre; 4. Modificar DNI;  5. Salir" );
                 opciones = sc.nextInt();
        switch (opciones){
            case 1:
                ps.crearPassword(p);
                break;
            case 2:
                ps.analizarPassword(p);
                break;
            case 3:
                ps.modificarNombre(p);
                break; 
            case 4:
                ps.modificarDNI();
                break;
            case 5:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Error en la opcion");
                
        }
        }while (opciones !=5);
        
    }
}

