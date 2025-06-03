package exercicios;

import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite sua nota (0 a 100): ");
        int nota = sc.nextInt();

        
        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Por favor, insira um valor entre 0 e 100.");
        } else {
            
            if (nota >= 60) {
                System.out.println("Parabéns! Você foi APROVADO.");
            } else {
                System.out.println("Você foi REPROVADO.");
            }
        }

        sc.close();
    }
}