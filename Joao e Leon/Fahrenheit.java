package aula;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	double fah, cel;
	System.out.println("Qual a temperatura em Fahrenheit?");
	fah = in.nextInt();
	cel=(fah-32)*5/9;
	System.out.println("A temperatura é "+cel);
	if (cel<0)
		System.out.println("Frio extremo");
	in.close();
	}

}
