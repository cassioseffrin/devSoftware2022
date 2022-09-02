package exercicios;

import java.util.Scanner;

/**
 *
 * @author Cassio Seffrin
 */
/*
 * 2. Faça um algoritmo que peça dois números ao usuário e em seguida multiplique-os. 
 * Mostre na tela o resultado.
 */
 
public class Exercicio2 {
    /**
     * 
     * Metodo que multiplica 2 numeros
     * 
     * @param n1 numero1
     * @param n2 numero2
     * @return
     *   
     */
	private float multiplica(float n1, float n2) {
		return n1*n2;
	}
	
	 /**
	  * 
	  * @param a um array
	  */
	public static void main(String a[]) {		
		Exercicio2 e2 = new Exercicio2();
		float n1;
		float n2;
		float resultado;
		Scanner scan = new Scanner(System.in);		
		System.out.println("Digite o numero 1: ");
		n1 = scan.nextFloat();
		System.out.println("Digite o numero 2: ");
		n2 = scan.nextFloat();
		resultado = e2.multiplica(n1, n2);
		System.out.printf("Resultado da multiplicacao %s X %s = %s", n1, n2, resultado);
		scan.close();
	}
}
