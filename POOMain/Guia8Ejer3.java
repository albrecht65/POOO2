/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Service.PersonaServicio;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia8Ejer3 {
    
    public static void main(String[] args) {
    double contaMayorEdad =0;
    double contaMenorEdad =0;
    double contaMenorPeso =0;
    double contaPesoIdeal =0;
    double contaMayorPeso =0;
    
        
    PersonaServicio[]perservv = new PersonaServicio[4];
    Boolean []perservv1 = new Boolean[4];
    Integer[]perservv2 = new Integer[4];
    
        for (int i = 0; i < 4; i++) {
           PersonaServicio perserv = new PersonaServicio();
           perserv.crearPersona();
           perservv[i]= perserv;
           perservv1[i]= perserv.esMayorDeEdad();
           perservv2[i]=  perserv.calcularIMC();
           
       // System.out.println(perservv [i]);    
        }
        
        for (int i = 0; i < 4; i++) {
           if(perservv1[i] == true){
            contaMayorEdad++;
            } else {
            contaMenorEdad++;
            }
           if(perservv2[i] == -1){
               contaMenorPeso++;
           
           } else if (perservv2[i] == 0){
               contaPesoIdeal++;
               
           } else {
               contaMayorPeso++;
           }   
           
        }
 
         System.out.println((contaMayorEdad/4)*100 + "% son mayor de edad "+ (contaMenorEdad/4)*100+ "% son menores de edad" );         
         System.out.println((contaMenorPeso/4)*100 + " estan por debajo del peso" + (contaPesoIdeal/4)*100 + " tienen peso ideal" + (contaMayorPeso/4)*100 + "tien sobrepeso")
                 ;
        }
    }


    

