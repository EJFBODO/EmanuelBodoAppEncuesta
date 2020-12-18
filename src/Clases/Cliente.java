
package Clases;

/**
 *
 * @author Emanuel
 */
public class Cliente {
    
  private String nombre,apellido,numeroDeCliente;
  


    public Cliente(String nombre, String apellido, String numeroDeCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCliente = numeroDeCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDeCliente(String numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDeCliente() {
        return numeroDeCliente;
    }
  
  
    public void mostrar() {

        System.out.println("\nNombre:" + nombre + "\nApellido:" + apellido + "\nNumero de cliente:" + numeroDeCliente);

    }

    public static boolean validarNombre (String nombre){
        if (nombre.isEmpty()){return false;}
        return true;  }
        
        public static boolean validarApellido (String apellido){
            if (apellido.isEmpty()){return false;}
            return true;  }
        
        public static boolean validarNumeroCliente (int numeroCliente){
            if (numeroCliente <0){return false;}
            return true;  }
}
