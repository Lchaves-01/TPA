package aula;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double Numero;
	System.out.println("Qual o numero?");
	Numero = in.nextInt();
	if (Numero%2==0) 
		System.out.println("Numero par");
	else System.out.println("Numero impar");
	in.close();
	}
}
