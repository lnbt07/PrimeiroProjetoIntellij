package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b;

        System.out.println("Digite o valor de A: ");
        a = teclado.nextInt();

        System.out.println("Digite o valor de B: ");
        b = teclado.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
    
    public static int subtrair(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(int a, int b) {
        return a / b;
    }
}
