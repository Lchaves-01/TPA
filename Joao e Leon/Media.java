package aula;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, media, notaExame, novaMedia;

        System.out.print("Digite a primeira nota: ");
        nota1 = in.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media < 3.0) {
            System.out.println("Situação: Reprovado");
        } else if (media >=6.0){
            System.out.println("Situação: Aprovado");
        }else {
        	System.out.println("Escreva sua nota do exame");
        	notaExame = in.nextDouble();
        	novaMedia = (media + notaExame)/2;
        	if (novaMedia>=6) {
        		System.out.println("Aprovado pós exame");
        	}else {
        		System.out.println("Reprovado mesmo após o exame, você é muito burro");
        	}
        }
        	

        in.close();
    }
}
