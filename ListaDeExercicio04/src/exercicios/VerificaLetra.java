package exercicios;

import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite uma letra: ");
        String entrada = sc.next().toLowerCase();

       
        if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
            System.out.println("Entrada inválida. Por favor, digite apenas uma letra.");
        } else {
           
            char letra = entrada.charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra " + letra + " é uma VOGAL.");
            } else {
                System.out.println("A letra " + letra + " é uma CONSOANTE.");
            }
        }

        sc.close();
    }
}