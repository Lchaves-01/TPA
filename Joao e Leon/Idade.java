package aula;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	double idade, AnoN, AnoA;
	System.out.println("Qual Ano nos estamos?");
	AnoA = in.nextInt();
	System.out.println("Qual Ano você naceu?");
	AnoN = in.nextInt();
	idade=AnoA-AnoN;
	if(idade>=18) 
	System.out.println("Maior de idade");
	else System.out.println("Menor de idade");
	in.close();
	}

}
