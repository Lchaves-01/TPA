import java.util.Scanner;
public class Inverso {


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[], i;
		
		a = new int [TAM];
		b = new int [TAM];
			
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+ "o. valor de A");
			a[i] = ler.nextInt();
		}
		System.out.print("B = [ ");
		for(i=9; i < TAM && i < -1; i--) {
			b[i] = a[i];
			System.out.print(b[i]+ " ");
		}
		System.out.print("]");
		
		ler.close();
	}

}
