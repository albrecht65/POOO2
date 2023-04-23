/*
 Métodos para desarrollar:
• Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por teclado)
• Crear un método para ingresar una contraseña (crearPass). En este método, 
debemos validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
• Crear un método para analizar la contraseña (analizar Pass). Donde:
SI Existe al menos una letra z : Es nivel MEDIO
Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
Si ninguna condición se cumple es nivel BAJO
• Crear los métodos correspondientes para modificar el nombre o DNI. Atención! 
Primero debe ingresar el pass para poder realizar dicha gestión. Caso contrario
se impedirá el acceso a modificar los datos.
A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contrasena valida.
B) Mensaje al usuario que tipo de NIVEL es su contraseña o C) Modificar contraseña, 
donde primero debe poner su contraseña anterior para
dar permiso
• C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios.
 */
package Service;

import Entidad.Pass;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class PassService {

// asigno valor a los atributos
    Pass p = new Pass("Juana", 18345987, "gabriela78");

    Scanner sc = new Scanner(System.in);

    public void crearPassword(Pass p) {
        // se establecio que los intentos serian 3

        int intentos = 0;
        do {
            intentos++;
            System.out.println("Ingresar la contrasenia");
            p.setContrasenia(sc.next());

            if (p.getContrasenia().length() == 10) {
                intentos = 3; // para salir bucle

            } else {
                if (intentos == 3) {
                    System.out.println("Ha superado los intentos");
                } else {
                    System.out.println("Contrasenia invalida");
                    System.out.println("Restan" + (3 - intentos));
                }
            }
        } while (p.getContrasenia().length() != 10 && intentos < 3);
        
    }

    //mal
    public void analizarPassword(Pass p) {
        int contaZ = 0;
        int contaA = 0;
        System.out.println(p.getContrasenia());

        for (int i = 0; i < 10; i++) {//largo es siempre 10
            if (p.getContrasenia().substring(i, i + 1).equalsIgnoreCase("z")) {
                contaZ++;

            }
            if (p.getContrasenia().substring(i, i + 1).equalsIgnoreCase("a")) {
                contaA++;
            }
        }
        if (contaZ >= 1) {
            if (contaA >= 2) {
                System.out.println("el nivel de la contrasenia es ALTA");
            }else {
                System.out.println("el nivel de la contrasenia es MEDIO");
            } 
            }else {       
             System.out.println("el nivel de la contrasenia es BAJA");
         }
       
        }
    

    public void modificarNombre(Pass p) {
        System.out.println("Introduzca la contrasenia para cambiar nombre");
        String contraseniaBis = sc.next();
        if(p.getContrasenia().equals(contraseniaBis)){ 
            System.out.println("Ingrese el nuevo nombre");
            String nuevoNombre = sc.next();
            p.setNombre(nuevoNombre);
        } else {
            System.out.println("No tiene acceso autorizado para realizar cambio nombre");
        }

    }

    public void modificarDNI() {
        System.out.println("Introduzca la contrasenia para cambiar dni");
        String contraseniaBis = sc.next();
        if(p.getContrasenia().equals(contraseniaBis)){
            System.out.println("Ingrese el nuevo dni");
            int nuevoDNI = sc.nextInt();
            p.setDni(nuevoDNI);
        } else {
            System.out.println("No tiene acceso autorizado para realizar cambio de DNI");
            System.out.println(p.getContrasenia());
        }

    }

}
