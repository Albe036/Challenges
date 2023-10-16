import javax.swing.*;

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class isAPrime {
    public static void main(String[] args) {
        String numberInput = JOptionPane.showInputDialog("Ingrese un numero entero: ");
        Integer numberInt = 0;
        Boolean isPrime = true;
        try {
            numberInt = Integer.valueOf(numberInput);
            for (int i = 2; i < numberInt; i++) {
                if ((numberInt % i == 0) && numberInt != i) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                JOptionPane.showMessageDialog(null, "El numero es primo");
            } else {
                JOptionPane.showMessageDialog(null, "El numero no es primo");
            }
            System.out.println("Los numeros primos de 1 a 100 son: ");
            for (int i = 2; i < 100; i++) {
                boolean isaPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0 && i != j) {
                        isaPrime = false;
                    }
                }
                if (isaPrime) {
                    System.out.println(String.valueOf(i).concat(" Es primo"));
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es un numero entero");
            main(args);
            System.exit(0);
        }
    }
}
