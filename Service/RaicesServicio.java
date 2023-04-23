/*
 Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje.

 */
package Service;

import Entidad.Raices;

/**
 *
 * @author gabrielaalbrecht
 */
public class RaicesServicio {
    
    // nunca se debe instanciar un unico objeto en servicios.
   // Raices raiz = new Raices();
    
    // main llama y parametro el objeto.
    public double getDiscriminante(Raices raiz){
        double discriminante;
        discriminante = (Math.pow(raiz.getB(), 2))- 4*raiz.getA()*raiz.getC();
        return discriminante; 
    }
    
    public boolean tieneRaices(Raices raiz){
       // (-b±√((b^2)-(4*a*c)))/(2*a)
      // double r1, r2;
      // r1 = ((-raiz.getB()+ Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA()));
      // r2 = ((-raiz.getB()- Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA()));
      //  System.out.println("r1" + r1 + "r2" + r2);
       return (getDiscriminante(raiz)>=0);
    } 
    
    public boolean tieneRaiz(Raices raiz){
        return (getDiscriminante(raiz)== 0);
    }

    public void obtenerRaices(Raices raiz){
      double r1, r2;
      double discriminante = getDiscriminante(raiz);
        
      if (tieneRaices(raiz)){
      r1 = ((-raiz.getB()+ Math.sqrt(discriminante))/(2*raiz.getA()));
      r2 = ((-raiz.getB()- Math.sqrt(discriminante))/(2*raiz.getA())); 
       System.out.println("r1 " + r1 + " r2 " + r2); 
    }
    }
    
    public void obtenerRaiz(Raices raiz){
      double r1, r2;
      double discriminante = getDiscriminante(raiz);
      
      r1 = ((-raiz.getB()+ Math.sqrt(discriminante))/(2*raiz.getA()));
      r2 = ((-raiz.getB()- Math.sqrt(discriminante))/(2*raiz.getA())); 
      
      if (tieneRaiz(raiz)&& r1 ==r2){
         System.out.println("la raiz unica es " + r1); 
    }
    }
     
    public void calcular(Raices raiz){
     
        if(tieneRaiz(raiz)){
            obtenerRaiz(raiz);
        } else if (tieneRaices(raiz)){
            obtenerRaices(raiz);
 
        } else {
            System.out.println("No hay solucion");
        }
        
}
}

