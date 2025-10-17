import java.util.Scanner;
public class Soma {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=5;
		int a[], b[], c[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+ "o. valor de A");
			a[i] = ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+ "o. valor de B");
			b[i] = ler.nextInt();
			
			c[i] = b[i] + a[i];
		}
		
		System.out.print("C = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
		
		ler.close();
	}
}
