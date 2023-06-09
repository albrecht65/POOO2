/*
 Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que 
le corresponderá. Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la 
letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método 
que funciona de la siguiente manera: Para calcular la letra se toma el resto de 
dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de caracteres la posición que 
corresponda al resto de la división para obtener la letra correspondiente. 
La tabla de caracteres es la siguiente:

 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class NIFService {
     Scanner sc = new Scanner(System.in);
    
    NIF n = new NIF();
    /// creacion vector
    String [] letra =  {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D","X", "B", "N", "J", "Z", "S", "Q","V","H", "L", "C", "K", "E"   };
   
    public void crearNif(){
        String digito = "";
        System.out.println("Ingrese el dni");
        n.setDNI(sc.nextLong());
        
        for (int i = 0; i < letra.length; i++) {
            if((n.getDNI()% 23) ==i){
               digito = letra[i];
               n.setLetra(digito);
        }
           
        }
    }
    
    public void mostrar(){
        System.out.println("el NIF  es: " +n.getDNI()+ "-"+ n.getLetra());
        
    }
    

}
