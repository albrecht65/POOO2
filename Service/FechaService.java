/*
 Se deberá en métodos independientes:
• Verificar que el año ingresado por el usuario este entre 1900 y 2021, 
caso contrario, el año tomara el valor por defecto.
• Conocer la cantidad de días totales que tiene el mes elegido por el usuario. 
EJ: USTED INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
• Mostrar día anterior a la fecha ingresada 
(Hay que considerar que sucede con inicio de cada mes)
 */
package Service;

import Entidad.Fecha;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class FechaService {
    Scanner sc = new Scanner(System.in);
   
    Fecha f = new Fecha();
   
    public void ingresoFecha(Fecha f){
 
        do{
        System.out.println("Ingrese el anio");
        f.setAnio(sc.nextInt());
        if (f.getAnio()<1900 || (f.getAnio()>2021)){
            f.setAnio(1900);
        } else {
            f.getAnio();
        }
        
        System.out.println("Ingrese el mes");
        f.setMes(sc.nextInt());
        if (f.getMes() >12 || f.getMes()<1){
            System.out.println("El mes es incorrecto");
            break;
        } else{
            f.getMes();
        }
        
        System.out.println("Ingrese el dia");
        f.setDia(sc.nextInt());
        if (f.getMes() == 2 && f.getDia()>29){
            System.out.println("El mes no tiene esa cantidad de dias.");
            break;
        }else if (f.getMes()== 4 || f.getMes()==6 || f.getMes()==9|| f.getMes()==11 && f.getDia()>30){
            System.out.println("El mes no tiene esa cantidad de dias.");
            break;
         }else if (f.getMes()==3 ||f.getMes()==5||f.getMes()==7||f.getMes()==8 || f.getMes()==10 || f.getMes()==12 && f.getDia()>31){
            System.out.println("El mes no tiene esa cantidad de dias.");
            break;
        } else {
          f.getDia();
        System.out.println("el dia es " + f.getDia());
    }
    }while(f.getAnio()>1 || f.getMes()>1 || f.getDia()>1); 
    
} 
}

        
        
        
    
    
  
    
