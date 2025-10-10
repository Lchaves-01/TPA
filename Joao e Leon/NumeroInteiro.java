package aula;

import java.util.Scanner;

public class NumeroInteiro {

	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	double n;
	System.out.println("Qual o numero?");
	n = in.nextInt();
	if (n>0) {
	System.out.println("Positivo");
	}
	else if (n==0) {
	System.out.println("Neutro");
	}
	else System.out.println("Negativo");
	in.close();
	}
}
