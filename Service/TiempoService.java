/*
 Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. 
Definir dos constructores: un constructor vacio y otro con la hora, minutos y 
segundos ingresado por el usuario. Deberá definir además, los métodos getters 
y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados 
por el usuario. Te animas a simular el paso del tiempo en consola??????
 */
package Service;

import Entidad.Tiempo;

/**
 *
 * @author gabrielaalbrecht
 */
public class TiempoService {
    
    Tiempo t = new Tiempo();
    
    public void imprimirHoraCompleta(Tiempo t){
        if (t.getHora()> 24 || t.getHora()<0){
            System.out.println("la hora es incorrecta vuelva a ingresarla");
       } else if (t.getMin()>60 || t.getMin()<0) {
            System.out.println("los minutos son incorrectos vuelva a ingresarlos");
       } else if (t.getSegundos()>60 || t.getSegundos()<0){
           System.out.println("los segundos son incorrectos vuelva a ingresarlos");
       }else     
           System.out.println("la hora es "+ t.getHora()+ ":"+ t.getMin() + ":" + t.getSegundos());
        
        }
   
    
    
    
}
