package aula;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double capacTanque, distancia, consumo;
	
	System.out.println("qual foi a distância percorrida em quilômetros?");
	distancia = in.nextDouble();
	System.out.println("qual é a capacida do seu tanque em litro?");
	capacTanque = in.nextDouble();
	consumo = distancia/capacTanque;
	
	System.out.println("Seu consumo é " + consumo);
	if (consumo<=10) {
		System.out.println("Seu automóvel é econômico");
	}
	else {
		System.out.println("Seu automóvel não é econõmico");
	}
	in.close();
	}

}
