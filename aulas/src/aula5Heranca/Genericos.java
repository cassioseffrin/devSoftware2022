package aula5Heranca;

public class Genericos {
	
	public static String[] strArray = {"Nikolas", "Mateus", "Ruan", "Mariana" };
	
	public static Integer[] intArray = {1, 2, 3, 4, 5};
	
	public static void imprimirArrayString(String[] array ) {
		for ( int i=0; i< array.length ;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void imprimirArrayInteiros(Integer[] array ) {
		for ( int i=0; i< array.length ;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static <E> void imprimirArrayGenerico(E[] array ) { 
		for ( int i=0; i< array.length ;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main (String a[]) {		
		imprimirArrayString(strArray);
		imprimirArrayInteiros(intArray);
		
		imprimirArrayGenerico(strArray);
		imprimirArrayGenerico(intArray);
		
		Farmaceutico f1 = new Farmaceutico();		
		f1.nome = "Jose";
		f1.cpf = "23456465";
		f1.rg = "567567567";
		
		Farmaceutico f2 = new Farmaceutico();		
		f2.nome = "Jose";
		f2.cpf = "23456465";
		f2.rg = "567567567";
		
		Farmaceutico[] farmaceuticoArray = {f1, f2 };
		imprimirArrayGenerico(farmaceuticoArray);
		
		
		
	}
  
}




