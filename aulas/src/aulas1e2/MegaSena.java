package aulas1e2;

import java.util.Scanner;

public class MegaSena {
	public static double fatorial(double n) {
		if (n == 1) {
			return n;
		}
		return n * fatorial(n - 1);
	}

	public static void main(String a[]) {
		
		double sena = fatorial(60) / (fatorial(6) * fatorial(54));
		double quina = sena/324;
		double quadra = sena/21465;
		
		System.out.printf("O Numero de apostas para acertar na megasena é: %.1f", sena);	
		System.out.printf("\n\nO Numero de apostas para acertar quina é: %.1f", quina);		
		System.out.printf("\n\nO Numero de apostas para acertar quadra é: %.1f", quadra);		
		

	}
}





//let arrayList = lista.forEach( e => e.textContent);


