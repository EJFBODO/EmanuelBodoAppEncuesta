
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class Encuesta extends Cliente{
    
  private double nivelAtencion,nivelResolucion,nivelRecomendacion;
  

    public Encuesta(double nivelAtencion, double nivelResolucion, double nivelRecomendacion, String nombre, String apellido, String numeroDeCliente) {
        super(nombre, apellido, numeroDeCliente);
        this.nivelAtencion = nivelAtencion;
        this.nivelResolucion = nivelResolucion;
        this.nivelRecomendacion = nivelRecomendacion;
    }

    public void setNivelAtencion(int nivelAtencion) {
        this.nivelAtencion = nivelAtencion;
    }

    public void setNivelResolucion(int nivelResolucion) {
        this.nivelResolucion = nivelResolucion;
    }

    public void setNivelRecomendacion(int nivelRecomendacion) {
        this.nivelRecomendacion = nivelRecomendacion;
    }

    public double getNivelAtencion() {
        return nivelAtencion;
    }

    public double getNivelResolucion() {
        return nivelResolucion;
    }

    public double getNivelRecomendacion() {
        return nivelRecomendacion;
    }
  
 public double promedio (double nivelAtencion,double nivelResolucion,double nivelRecomendacion){
     double suma;
     suma=(nivelAtencion+nivelResolucion+nivelRecomendacion);
     double prom;
     prom=(suma/3);
     
     return prom;
    
}
 public boolean mayorMenor(int x){ 
if(x<11){
    if (x>0){
    return true;
    }
}JOptionPane.showMessageDialog(null, "El valor es incorrecto mínimo permitido 1 máximo permitido  10");return false;

}
}