package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class Validadores {

    public static boolean validarNombre(String nombre) {
        if (!nombre.isEmpty()) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "El campo no puede estar vacio", "Retry", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    public static boolean validarApellido(String apellido) {
        if (!apellido.isEmpty()) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "El campo no puede estar vacio", "Retry", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    public static boolean validarNumeroCliente(int numeroCliente) {
        if (numeroCliente > 0) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "El número debe ser mayor a 0", "Retry", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    public boolean maxMin(double x) {
        if (x < 11) {
            if (x > 0) {
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Maximo 10 minimo 0", "Retry", JOptionPane.WARNING_MESSAGE);
        return false;

    }

}
