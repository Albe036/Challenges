import javax.swing.*;

/* Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.*/

import static java.util.Arrays.sort;

public class isAnAnagrama {
    public static void main(String[] args) {
        String wordOne = JOptionPane.showInputDialog("Ingrese la primera palabra").toLowerCase().trim();
        String wordTwo = JOptionPane.showInputDialog("Ingrese la segunda palabra").toLowerCase().trim();
        if (wordOne.equals(wordTwo) || wordOne.length() != wordTwo.length()) {
            System.out.println("No es un Anagrama");
        } else {
            int contador = 0;
            char[] arrWordOne = wordOne.toCharArray();
            sort(arrWordOne);
            char[] arrWordTwo = wordTwo.toCharArray();
            sort(arrWordTwo);
            for (int i = 0; i < wordOne.length(); i++) {
                if (arrWordOne[i] == arrWordTwo[i]) {
                    contador++;
                }
            }
            if (contador == wordOne.length()) {
                System.out.println("Las palabras: '".concat(wordOne).concat("' y '").concat(wordTwo).concat("' son anagramas"));
            } else {
                System.out.println("No es un anagrama");
            }
        }
    }
}
