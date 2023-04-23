/*
 Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). 
No se podrá utilizar ningún tipo de objeto de "clase fechas". 
Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente. */
package Entidad;

/**
 *
 * @author gabrielaalbrecht
 */
public class Fecha {
    private int dia = 1;
    private int mes = 1;
    private int anio = 1900;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
