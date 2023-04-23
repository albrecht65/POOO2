/*
 Crear una clase llamada fracción que contenga 4 atributos (denominador y 
numerador de cada fracción). Crear la clase servicio que contenga métodos para 
sumar, restar, multiplicar y dividir fracciones. Mostrar por pantalla un menú de
opciones para que el usuario decida que ver.
 */
package Service;

import Entidad.Fraccion;
import java.util.Scanner;


/**
 *
 * @author gabrielaalbrecht
 */
public class FraccionService {
    double denominadorComun =0;
    double primeraFraccion = 0;
    double segundaFraccion = 0;
    double resultado = 0;
    
    Scanner sc = new Scanner(System.in);
    
   Fraccion f1 = new Fraccion();
    
    public void sumar(Fraccion f1){
        
        if (f1.getDenominador1()== f1.getDenominador2()){
            resultado = ((f1.getNumerador1()+ f1.getNumerador2())/(f1.getDenominador1()));
            System.out.println("la suma de fracciones con el mismo denominador es "+resultado);
        } else {
          denominadorComun = f1.getDenominador1() * f1.getDenominador2();
          primeraFraccion = (f1.getNumerador1()*(denominadorComun / f1.getDenominador1()));
          segundaFraccion = (f1.getNumerador2()*(denominadorComun / f1.getDenominador2()));
          resultado = ((primeraFraccion + segundaFraccion))/denominadorComun;
            System.out.println("la suma de fracciones con denominador distinto es " + resultado);
        
                    }    
        }
           
    public void restar(Fraccion f1){
        if (f1.getDenominador1()== f1.getDenominador2()){
            resultado = ((f1.getNumerador1()- f1.getNumerador2())/(f1.getDenominador1()));
            System.out.println("la resta de fracciones con el mismo denominador es "+resultado);
        } else {
            if (f1.getDenominador1()% f1.getDenominador2()== 0){
                primeraFraccion = f1.getNumerador1();
                segundaFraccion = (f1.getNumerador2()*((f1.getDenominador1()/f1.getDenominador2())));
                resultado = ((primeraFraccion - segundaFraccion))/f1.getDenominador1();
                System.out.println("la resta de las fracciones con denominadores multiplos es " + resultado);
            } else if (f1.getDenominador2()% f1.getDenominador1()== 0){
                primeraFraccion = (f1.getNumerador1()*((f1.getDenominador2()/f1.getDenominador1())));
                segundaFraccion = f1.getNumerador2();
                resultado = ((primeraFraccion - segundaFraccion))/f1.getDenominador2();
                System.out.println("la resta de las fracciones con denominadores multiplos es " + resultado);
            } else if (f1.getDenominador1()% f1.getDenominador2()!= 0 || f1.getDenominador2()% f1.getDenominador1()!= 0) {
            denominadorComun = f1.getDenominador1() * f1.getDenominador2();
            primeraFraccion = (f1.getNumerador1()*(denominadorComun / f1.getDenominador1()));
            segundaFraccion = (f1.getNumerador2()*(denominadorComun / f1.getDenominador2()));
            resultado = ((primeraFraccion - segundaFraccion))/denominadorComun;
              System.out.println("la resta de las fracciones con denominadores NO multiplos es " + resultado);  
        }
              
            
    }
    }
    
    public void multiplicar(Fraccion f1){
        resultado = ((f1.getNumerador1()*f1.getNumerador2())/(f1.getDenominador1()*f1.getDenominador2()));
        System.out.println("la multiplicacion de las fraciones es: " +resultado);
        
    }
    
    public void dividir (Fraccion f1){
        resultado = (f1.getNumerador1()*f1.getDenominador2())/(f1.getDenominador1()*f1.getNumerador2());
        System.out.println("la division de las fracciones es: " + resultado);
        
    }
    

    
public void mostrar (Fraccion f1){
        int opcion = 0;
         
         do{
         System.out.println("Ingrese la opcion que desea: 1.Sumar , 2.Restar, 3.Multiplicar, 4.Dividir");
         opcion = sc.nextInt();
         
            switch (opcion){
                case 1:
                    sumar(f1);
                    break;
                case 2:
                    restar(f1);
                    break;
                case 3:
                    multiplicar(f1);
                    break;
                case 4:
                    dividir(f1);
                    break;
                    
             default:
                     System.out.println("Opcion incorrecta");
                     break;
            } 
        }while(opcion == 1 ||opcion == 2 ||opcion == 3 ||opcion == 4);       
}
         
}

