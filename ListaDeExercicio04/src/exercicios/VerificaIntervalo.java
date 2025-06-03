package exercicios;

import java.util.Scanner;

public class VerificaIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        
        if (numero >= 10 && numero <= 20) {
            System.out.println("O número " + numero + " está no intervalo de 10 a 20.");
        } else {
            System.out.println("O número " + numero + " NÃO está no intervalo de 10 a 20.");
        }

        sc.close();
    }
}