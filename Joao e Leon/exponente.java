package atvd;
import java.util.Scanner;
public class expoente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int resultado = 1;
		int expoente;
		int i = 1;
		int n;
		
		System.out.println("Digite o numero desejado: ");
		n = ler.nextInt();
		System.out.println("Digite o seu expoente: ");
		expoente = ler.nextInt();
		
		 do {
			resultado = resultado * n;
			i ++;
		} while (i <= expoente);
		
		System.out.println("Sua potencia é: " +resultado);
		ler.close();
	} 
}
