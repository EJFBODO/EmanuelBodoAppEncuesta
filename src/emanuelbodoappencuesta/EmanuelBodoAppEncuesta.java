
package emanuelbodoappencuesta;
import Clases.Cliente;
import Clases.Encuesta;
import Clases.Validadores;
import Formularios.formularioCliente;

public class EmanuelBodoAppEncuesta {

 
    public static void main(String[] args) {
        
        Cliente a;
        
      //  a= new Cliente("Emanuel", "Bodo", 50);
        
        //a.mostrar();
       // Cliente.validarNombre("Emanuel");
      //  Cliente.validarApellido("Bodo");
        //Cliente.validarNumeroCliente(50);
        
           formularioCliente F = new formularioCliente();
F.setVisible(true);
       
    }
    
}
