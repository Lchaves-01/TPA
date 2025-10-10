package aula;

import java.util.Scanner;

public class ClassificaçãoIdade {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	int AnoNasc, AnoAtual, Idade;
	
	System.out.println("Qual ano você nasceu?");
	AnoNasc = in.nextInt();
	System.out.println("Digite o ano atual");
	AnoAtual = in.nextInt();
	Idade = AnoAtual-AnoNasc;
	
	System.out.println("Sua idade é " + Idade);
	if ( Idade<10) {
		System.out.println("Criança");
	}
	else if(Idade<18) {
		System.out.println("Adolecente");
	}
	else if (Idade<60) {
		System.out.println("Adulto");
	}
	else {
		System.out.println("Idoso");
	}
	in.close();
	}

}
