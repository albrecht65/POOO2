/*
 *Método para crear cuenta pidiéndole los datos al usuario.
*Método ingresar(double): recibe una cantidad de dinero a ingresar y se 
le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se 
retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package Service;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class CuentaBancariaServicio {
    
  Scanner sc = new Scanner (System.in);
       CuentaBancaria cb = new CuentaBancaria();


    public void crearCuenta(){
            
        System.out.println("Ingrese el numero de cuenta");
        cb.setNumeroCuenta(sc.nextInt());
        cb.getNumeroCuenta();
        
        System.out.println("Ingrese el dni");
        cb.setDniCliente(sc.nextLong());
        
        System.out.println("Ingrese el saldo actual");
        cb.setSaldoActual(sc.nextDouble());
        
    }
     
    public void ingresar(double ingreso){
        System.out.println("el nuevo saldo verdadero" + (cb.getSaldoActual() + ingreso));  
       cb.setSaldoActual(cb.getSaldoActual() + ingreso);
    }
    
    public void retirar (double retiro){
        if (retiro > cb.getSaldoActual()){
        System.out.println("No es posible realizar el retiro");
        } else {
        System.out.println("El saldo luego del retiro es " + (cb.getSaldoActual() - retiro));   
        cb.setSaldoActual(cb.getSaldoActual()- retiro);
    }
 
    }
 
    public void extraccionRapida(){
        System.out.println("Se extrajo " + cb.getSaldoActual()*0.20);
        cb.setSaldoActual(cb.getSaldoActual() * 0.80);
    }
    public void consultarSaldo(){
        System.out.println("El saldo actual es: " +cb.getSaldoActual());
    }
    public void consultarDatos (){
        System.out.println("El numero de cuenta es : "+ cb.getNumeroCuenta() +"El dni del cliente es  "  + cb.getDniCliente() +"El saldo actualizado es " +cb.getSaldoActual());
        
    }
    
}
