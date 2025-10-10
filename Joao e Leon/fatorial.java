package atvd;
import java.util.Scanner;
public class fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n, fatorial, i=1;
		
		System.out.println("Digite o numero desejado: ");
		n = ler.nextInt();
		fatorial = n;
		do {
			
			n = n * i;
			i ++;
		} while(i < fatorial);
		
		System.out.println("O seu fatorial é: " +n);
		ler.close();
	}
}
