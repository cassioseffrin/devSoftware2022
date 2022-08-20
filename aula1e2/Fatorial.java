public class Fatorial{
	//metodo recursivo.
	public Long fatorial(Long numero){
		if (numero == 1){
			return numero;
		}
		return numero * fatorial(numero-1);
	}

	public static void main (String a[]){
		Fatorial f = new Fatorial();
		System.out.println("fatorial de 12: "+ f.fatorial(20L) );	
	}

}
