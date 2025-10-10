package aula;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.print("Digite o primeiro lado do triângulo: ");
        lado1 = in.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        lado2 = in.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        lado3 = in.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero (todos os lados iguais)");
            } 
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles (dois lados iguais)");
            } 
            else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes)");
            }
        } 
        else {
            System.out.println("Os valores informados NÃO formam um triângulo válido.");
        }

        in.close();
    }
}