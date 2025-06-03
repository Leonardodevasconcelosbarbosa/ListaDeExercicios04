package exercicios;

import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o comprimento do lado A: ");
        double ladoA = sc.nextDouble();

        System.out.print("Digite o comprimento do lado B: ");
        double ladoB = sc.nextDouble();

        System.out.print("Digite o comprimento do lado C: ");
        double ladoC = sc.nextDouble();

        
        if (ladoA > 0 && ladoB > 0 && ladoC > 0 &&
            (ladoA + ladoB > ladoC) &&
            (ladoA + ladoC > ladoB) &&
            (ladoB + ladoC > ladoA)) {
            
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados NÃO formam um triângulo válido.");
        }

        sc.close();
    }
}