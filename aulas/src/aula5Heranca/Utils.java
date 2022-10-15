package aula5Heranca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

	public static <T> boolean salvar(T entidade, String arquivo) {
		File f = new File(arquivo);
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
			fos.write(entidade.toString().getBytes());
			System.out.println("o arquivo: " + arquivo + " foi gravado com sucesso!");
			fos.flush();
			fos.close();
			return true;
		} catch (Exception excessao) {
			System.out.println("opa, nao foi possivel criar o arquivo: " + arquivo);
			System.out.println(excessao.getMessage());
			return false;
		}
	}

	/**
	 * Criar um método genérico na classe Utils que seja capaz de ler um arquivo
	 * CSV. (de forma genérica) serializar para um objeto java. Deve fazer isso
	 * através de seu construtor e imprimir com System.out.println()
	 */
	public static ArrayList<Pessoa> lerPessoa(String arquivo) {
		File f = new File(arquivo);
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		try {
	        FileInputStream fis = new FileInputStream(f);
	        try (Scanner scanner = new Scanner(fis)) {
				while (scanner.hasNextLine()) {
				    String[] strQuebrada = scanner.nextLine().split(";");
				    Pessoa p = new Pessoa(strQuebrada[0], strQuebrada[1],strQuebrada[2]);
				    listaPessoas.add(p);
				}
			}
	        return listaPessoas;
	        
		} catch (Exception e) {
			return null;
		}
	}
	
 

}
