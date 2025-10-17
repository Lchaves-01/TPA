import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		double m = 0;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+ "o. valor");
			a[i] = ler.nextInt();
			b[i] = a[i];
			m = (b[i] + b[i])/TAM;
		}
		
		System.out.print(m);
	}
}

