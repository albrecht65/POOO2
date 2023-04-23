/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class PersonaServicio {
    Scanner sc = new Scanner(System.in);
    Persona per = new Persona();

    
    public boolean esMayorDeEdad() {
        return per.getEdad() >= 18;
    }
    public void crearPersona(){
         String sexo; 
         
        System.out.println("Ingrese su nombre");
        per.setNombre(sc.nextLine());
        System.out.println("Ingrese su edad");
        per.setEdad(sc.nextInt());
        System.out.println("Ingrese su altura");
        per.setAltura(sc.nextDouble());
        System.out.println("Ingrese su peso");
        per.setPeso(sc.nextDouble());
        System.out.println("Ingrese su sexo: H, M o O");
        sexo = sc.next();
        if (sexo.equals("H")|| sexo.equals("M") || sexo.equals("O")){
            per.setSexo(sexo); 
        } else {
                System.out.println("No es correcto");
            
            }
    }    
     
    public int calcularIMC(){
            double imc;
            imc = (per.getPeso()/(per.getAltura()*per.getAltura()));
           // imc = (per.getPeso()/(Math.pow(per.getAltura(), 2)));
            
        if (imc <20){
            return -1;
        } else if (imc >=20 && imc <=25){
            return 0;
        } else{
            return 1;
                    
        }
            
        
                
        
    }
}
