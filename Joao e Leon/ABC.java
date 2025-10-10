package aula;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite o valor de A: ");
        a = in.nextInt();

        System.out.print("Digite o valor de B: ");
        b = in.nextInt();

        System.out.print("Digite o valor de C: ");
        c = in.nextInt();
        
        if (a <= b && b <= c) {
            System.out.printf("Ordem crescente: " +a +", " +b +", " +c);
        } 
        else if (a <= c && c <= b) {
            System.out.printf("Ordem crescente: " +a +", " +c +", " +b);
        } 
        else if (b <= a && a <= c) {
            System.out.printf("Ordem crescente: " +b +", " +a +", " +c);
        } 
        else if (b <= c && c <= a) {
            System.out.printf("Ordem crescente: " +b +", " +c +", " +a);
        } 
        else if (c <= a && a <= b) {
            System.out.printf("Ordem crescente: " +c +", " +a +", " +b);
        } 
        else {
            System.out.printf("Ordem crescente: " +c +", " +b +", " +a);
        }

        in.close();
    }
}