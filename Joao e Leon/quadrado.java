import java.util.Scanner;
public class Quadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 6;
		int a[], b[], i;
		
		
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++ ) {
			System.out.println("Entre com o "+(i+1)+ "o. valor de A");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++ ) {
			b[i] = a[i] * a[i];
		}
		
		System.out.print("B = [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]");
		
		ler.close();
	}

}