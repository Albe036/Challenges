import javax.swing.*;

/*
 * Reto #0
 * Enunciado: Escribe un programa que muestre por consola (con un print)
 * los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".

 */
public class FizzBuzz {
    public static void main(String[] args) {
        try {
            String initialRange = JOptionPane.showInputDialog("Ingrese el numero de rango inicial");
            String finalRange = JOptionPane.showInputDialog("Ingrese el numero de rango final");
            for (int i = Integer.valueOf(initialRange); i <= Integer.valueOf(finalRange); i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else if (i % 3 == 0) {
                    System.out.println("fizz");
                } else if (i % 5 == 0) {
                    System.out.println("buzz");
                } else {
                    System.out.println(i);
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Error al ingresar rangos");
            main(args);
            System.exit(0);
        }

    }
}
