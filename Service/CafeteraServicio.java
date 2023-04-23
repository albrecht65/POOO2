/*
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que 
quede. El método le informará al usuario si se llenó o no la taza, y de no 
haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class CafeteraServicio {
    
    Scanner sc = new Scanner(System.in);
    Cafetera cafe = new Cafetera();
    
    
    public void llenarCafetera(){
      
    cafe.setCapacidadMáxima(sc.nextDouble());
    cafe.setCapacidadActual(cafe.getCapacidadMáxima());

    }
    public void servirTaza(int taza){
        taza = 200;
        int conta = 0;
        double resto =0;
     do {
         conta++;
         cafe.setCapacidadActual(cafe.getCapacidadActual()- taza);
         
     } while (cafe.getCapacidadActual()>= taza);
       resto = (cafe.getCapacidadActual()/taza)*100 ;
    
        System.out.println("el contador es " +conta);
      System.out.println("se han llenado " + conta + "tazas llenas" + "y" +resto+ "% de una taza");
    }
    
    public void vaciarCafetera(){
        cafe.setCapacidadActual(0);
        
    }
    public void agregarCafe(int cantcafe){
        System.out.println("Ingrese la cantidad de cafe");
        cafe.setCapacidadActual(sc.nextInt());
        System.out.println("se agrego a la cafetera " + cafe.getCapacidadActual() + " cafe");
        
    }
    
}
