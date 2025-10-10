package aula;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.print("Digite o valor de a: ");
        a = in.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = in.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = in.nextDouble();
        
        delta = (b*b) - (4*a*c);
        System.out.printf("Delta ", delta);
        
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } 
        else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: x =", x1);
        } 
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: x1 = ", x1, x2);
        }

        in.close();
    }
}
