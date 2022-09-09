package exercicios;

/**
*
* @author Cassio Seffrin
*/
import java.util.Scanner;

/*
 * 
 * 4. Construa um programa que leia a quantidade de quilômetros rodados e a quantidade gasta de
 * combustível em litros em uma viagem. Informe a média de combustível gasto em cada quilômetro
 * rodado.
 * escrever "digite o total de KM"
 * ler km
 * escrever "litros gastos"
 * ler litros
 * media = km/litros
 * escrever "media de km por litro" media
 */

public class Exercicio4 {
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a distancia em KMs:");
		float kms = scan.nextFloat();
			
		System.out.println("Digite o total de litros gastos:");
		float litros = scan.nextFloat();
		
		float resultado = kms / litros; 
		
		System.out.println("O consumo medio por litro e: " + resultado );
 
	}
	
}
