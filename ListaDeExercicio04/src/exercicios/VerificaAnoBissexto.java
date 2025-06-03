package exercicios;

import java.util.Scanner;

public class VerificaAnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

       
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é BISSEXTO.");
        } else {
            System.out.println("O ano " + ano + " NÃO é bissexto.");
        }

        sc.close();
    }
}
