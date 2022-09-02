package exercicios;

import java.util.Scanner;

/*
 * 3. Faça um algoritmo que lê os valores de 3 números,
 *  em seguida mostre na tela a média aritmética dos mesmos.
 */

/**
 *
 * @author Cassio Seffrin
 */
public class Exercicio3 {

	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		float n1;
		float n2;
		float n3;
		float media;
		System.out.println("Digite o numero 1: ");
		n1 = scan.nextFloat();
		System.out.println("Digite o numero 2: ");
		n2 = scan.nextFloat();
		System.out.println("Digite o numero 3: ");
		n3 = scan.nextFloat();
		media = (n1 + n2 + n3) / 3;
		System.out.printf("resultado: %2.2f", media);
		scan.close();
	}
}
