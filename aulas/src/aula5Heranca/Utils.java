package aula5Heranca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

	public static <T> boolean salvarCSV(T entidade, String arquivo) {
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

 
	public <E> boolean salvar(E entidade, String arquivo) {
		List<E> lstEntidadesGenerica = (List<E>) lerLista(arquivo);		
//		List<E> lstEntidadesGenerica = new ArrayList<>();
		lstEntidadesGenerica.add(entidade);

		File f = new File(arquivo);
		try {
			FileOutputStream fos = new FileOutputStream(f,false);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// List<E> lst = new ArrayList<E>();
			oos.writeObject(lstEntidadesGenerica);
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

	public <E extends Comparable<E>> List<E> lerLista(String arquivo) {
		try {
			File f = new File(arquivo);
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<E> lst = (List<E>) ois.readObject();
			return lst;

		} catch (Exception e) {
			System.out.println("falha ao ler a lista do arquivo: "+arquivo);
			criarListaVazia(arquivo);
			return null;
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
					Pessoa p = new Pessoa(strQuebrada[0], strQuebrada[1], strQuebrada[2]);
					listaPessoas.add(p);
				}
			}
			return listaPessoas;

		} catch (Exception e) {
			return null;
		}
	}
	

	public <E> List<E> criarListaVazia(String strArquivo) {
		try {
			File arquivo = new File(strArquivo);
			FileOutputStream fos = new FileOutputStream(arquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			List<E> lst = new ArrayList<E>();
			oos.writeObject(lst);
			System.out.printf("lista vazia persistida");
			return (List<E>) lerLista(strArquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

}
