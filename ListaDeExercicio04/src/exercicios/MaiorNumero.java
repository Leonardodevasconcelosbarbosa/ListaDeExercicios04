package exercicios;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = sc.nextDouble();

        
        double maior = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        
        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}