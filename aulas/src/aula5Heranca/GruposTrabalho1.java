package aula5Heranca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;
public class GruposTrabalho1 {
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		ArrayList<String> listaAlunos = pegarListaAlunos();
		ArrayList<String> listaAlunosSorteados = new ArrayList<>();
		ArrayList<Integer> indices = new ArrayList<>();
		for (int i = 0; i < listaAlunos.size(); i++) {
			int nAleatorio = sorteiaAluno(indices, listaAlunos.size());
			listaAlunosSorteados.add(listaAlunos.get(nAleatorio));
			indices.add(nAleatorio);
//			System.out.println(listaAlunos.get(nAleatorio));
		}
//		System.out.print(indices);
		ArrayList<String> listaTemas = pegarListaTemas();
		Collections.shuffle(listaTemas);
		for (int j = 0; j < 7; j++) {
			int inicio = j * 5;
			System.out.println("***** Grupo " + listaTemas.get(j) + " *****");
			for (int i = inicio; i <= inicio + 4; i++) {
				System.out.println(i + " - " + listaAlunos.get(i));
			}
		}
	}

	/**
	 * 
	 * @param indices
	 * @param tamanho
	 * @return retorna um numero aleatorio
	 * 
	 */
	private static int sorteiaAluno(ArrayList<Integer> indices, int tamanho) {
		Random r = new Random();
		Integer numero = r.nextInt(tamanho);
		Stream<Integer> filter = indices.stream().filter(i -> i.intValue() == numero);
		if (filter.count() > 0) {
			return sorteiaAluno(indices, tamanho);
		} else {

			return numero;
		}
	}

	/**
	 * 
	 * @return retorna a lista de todos alunos
	 */

	private static ArrayList<String> pegarListaAlunos() {

		ArrayList<String> listaAlunos = new ArrayList<>();
		listaAlunos.add("CAUÃ FILIPE GRAFF");
		listaAlunos.add("ERIK KNOBLAUCH RICKWARDT");
		listaAlunos.add("FELIPE DO AMARAL ANTONIAK");
		listaAlunos.add("FELIPE GABRIEL HINKEL");
		listaAlunos.add("GUILHERME GABRIEL CAMBRI FERRI");
		listaAlunos.add("IGOR RENOSTO TONDELLO");
		listaAlunos.add("JOÃO PEDRO WEBBER");
		listaAlunos.add("LÁZARO PIOLA SCHAURICH");
		listaAlunos.add("LUCAS EDUARDO VIVAN");
		listaAlunos.add("NIKOLAS SILVA LUNKES");
		listaAlunos.add("RICARDO BONISSONI ROSSETTO");
		listaAlunos.add("WESLEY FICANHA ");
		listaAlunos.add("DIOGO GUILHERME ROLOFF");
		listaAlunos.add("FELIPE AGUIAR");
		listaAlunos.add("IGOR JOSÉ XAVIER");
		listaAlunos.add("ISAAC ANTONIO GUISOLPHI FILHO");
		listaAlunos.add("LUIS FELIPE RIBEIRO");
		listaAlunos.add("MATHEUS DA SILVA STEFFEN VIEIRA");
		listaAlunos.add("RUAN VICTOR SCHEIDT");
		listaAlunos.add("WESLEY EVANDRO ");
		listaAlunos.add("ANA BEATRIZ SCHNEIDER");
		listaAlunos.add("ANDRÉ VITOR VALERIO");
		listaAlunos.add("ARTHUR HEUKO CIBOK");
		listaAlunos.add("BRUNO EDUARDO CASSIAS BARUZZO");
		listaAlunos.add("ELESSANDER RIBOVSKI");
		listaAlunos.add("GABRIELI DE FÁTIMA RUTHES");
		listaAlunos.add("GIOVANE RODRIGUES DA LUZ");
		listaAlunos.add("LUCAS GABRIEL PSCHEIDT");
		listaAlunos.add("LUCAS SKIBINSKI");
		listaAlunos.add("LUIS FELIPE SQUIOQUET CAMILLO");
		listaAlunos.add("MARIANA SAUER");
		listaAlunos.add("MATHEUS RUCHINSKI SPERKOSKI");
		listaAlunos.add("NICOLAS CARDOSO VILHA DO LAGO");
		listaAlunos.add("PAULO EDESON GONTARSKI JUNIOR");
		listaAlunos.add("RUAN FELIPE DE LIMA");

		return listaAlunos;

	}

	/**
	 * 
	 * @return retorna a lista de grupos
	 */
	private static ArrayList<String> pegarListaTemas() {

		ArrayList<String> temas = new ArrayList<>();
		temas.add("POSTO COMBUSTIVEL");
		temas.add("PET SHOP");
		temas.add("LOJA DE ROUPAS/MODAS");
		temas.add("LOJA DE MANUTENCAO DE CELULARES");
		temas.add("HOSPITAL");
		temas.add("TRANSPORTADORA");
		temas.add("RESTAURANTE");

		temas.add("OP1 E-COMMERCE");
		temas.add("OP2 BIBLIOTECA");
		temas.add("OP3 SISTEMA ACADEMICO");
		temas.add("OP4 LOCADORA");
		temas.add("OP5 SISTEMA PARA CONSULTORIOS");
		temas.add("OP5 SISTEMA PARA ESCRITORIOS DE ADVOCACIA");

		return temas;

	}

}
