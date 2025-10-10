package aula;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double peso, altura, imc;
        
        System.out.print("Digite seu peso em kg: ");
        peso = in.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        altura = in.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", +imc);
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III (obesidade mórbida)");
        }

        in.close();
    }
}