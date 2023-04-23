/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará 
al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se 
retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que
el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package POOMain;


import Service.CuentaBancariaServicio;
import java.util.Scanner;
import Entidad.CuentaBancaria;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia8Ejer1 {
    
    public static void main(String[] args) {
        int opcion; 
        boolean salir = true;
        
        Scanner sc = new Scanner(System.in);
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();  
        CuentaBancaria cb = new CuentaBancaria();
    
         System.out.println("Crear Cuenta");
         cbs.crearCuenta();
        
         do {
        System.out.println("Elija la opcion que desea: ");
             System.out.println("1. Deposito " + "2.Extraccion " + "3. Extraccion rapida " 
                     +"4. Consulta saldo " + "5. Consultar datos" + " 6. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:  System.out.println("Ingrese una cantidad de dinero a depositar ");
            cbs.ingresar(sc.nextDouble());
            break;
            case 2:   
            System.out.println("Ingrese una cantidad de dinero a retirar");
           cbs.retirar(sc.nextDouble());
           break;
            case 3:
            cbs.extraccionRapida();
            break;
            case 4:
            cbs.consultarSaldo();
            break;
            case 5:
            cbs.consultarDatos();
            break;
            case 6:
                salir = false;
            break;
            default:
                System.out.println("Error en la opcion");
        } 
        } while  (salir);
    
        }
}

      
    