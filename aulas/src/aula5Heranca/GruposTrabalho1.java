package aula5Heranca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GruposTrabalho1 {
	public static void main(String args[]) {

//		ArrayList<String> listaAlunos = pegarListaAlunos();
		
//		ArrayList<String> listaAlunosSorteados = new ArrayList<>();
//		ArrayList<Integer> indices = new ArrayList<>();
//		for (int i = 0; i <= 34; i++) {
//			int nAleatorio = sorteiaAluno(indices);
//			listaAlunosSorteados.add(listaAlunos.get(nAleatorio));
//			indices.add(nAleatorio);
//			System.out.println(listaAlunos.get(nAleatorio));	
//		}
		
//		Collections.shuffle(listaAlunos);
//		for (int j = 0; j < 7; j++) {
//			int inicio = j * 5;
//			System.out.println("***** Grupo " + (j + 1) + " *****");
//			for (int i = inicio; i <= inicio + 4; i++) {
//				System.out.println(i + " - " + listaAlunos.get(i));
//			}
//		}
		
		ArrayList<String> listaTemas = pegarListaTemas();
		Collections.shuffle(listaTemas);
		for (int j = 0; j < 7; j++) {
 
			System.out.println("***** Grupo " + (j + 1) + " *****");
	 
				System.out.println(  listaTemas.get(j));
		 
		}
		

//		CONCORDIA
//		
//		1	CAUÃ FILIPE GRAFF					
//		2	ERIK KNOBLAUCH RICKWARDT					
//		3	FELIPE DO AMARAL ANTONIAK					
//		4	FELIPE GABRIEL HINKEL					
//		5	GUILHERME GABRIEL CAMBRI FERRI					
//		6	IGOR RENOSTO TONDELLO					
//		7	JOÃO PEDRO WEBBER					
//		8	LÁZARO PIOLA SCHAURICH					
//		9	LUCAS EDUARDO VIVAN					
//		10	NIKOLAS SILVA LUNKES					
//		11	RICARDO BONISSONI ROSSETTO					
//		12	WESLEY FICANHA WUNDER
//		
//		
//		CURIBANOS
//		1	DIOGO GUILHERME ROLOFF					
//		2	FELIPE AGUIAR					
//		3	IGOR JOSÉ XAVIER					
//		4	ISAAC ANTONIO GUISOLPHI FILHO					
//		5	LUIS FELIPE RIBEIRO					
//		6	MATHEUS DA SILVA STEFFEN VIEIRA					
//		7	RUAN VICTOR SCHEIDT					
//		8	WESLEY EVANDRO PEREIRA
//		
//		
//		MAFRA
//		1	ANA BEATRIZ SCHNEIDER					
//		2	ANDRÉ VITOR VALERIO					
//		3	ARTHUR HEUKO CIBOK					
//		4	BRUNO EDUARDO CASSIAS BARUZZO					
//		5	ELESSANDER RIBOVSKI					
//		6	GABRIELI DE FÁTIMA RUTHES					
//		7	GIOVANE RODRIGUES DA LUZ					
//		8	LUCAS GABRIEL PSCHEIDT					
//		9	LUCAS SKIBINSKI					
//		10	LUIS FELIPE SQUIOQUET CAMILLO					
//		11	MARIANA SAUER					
//		12	MATHEUS RUCHINSKI SPERKOSKI					
//		13	NICOLAS CARDOSO VILHA DO LAGO					
//		14	PAULO EDESON GONTARSKI JUNIOR					
//		15	RUAN FELIPE DE LIMA

//		CONCORDIA
//		
//		1	CAUÃ FILIPE GRAFF					
//		2	ERIK KNOBLAUCH RICKWARDT					
//		3	FELIPE DO AMARAL ANTONIAK					
//		4	FELIPE GABRIEL HINKEL					
//		5	GUILHERME GABRIEL CAMBRI FERRI					
//		6	IGOR RENOSTO TONDELLO					
//		7	JOÃO PEDRO WEBBER					
//		8	LÁZARO PIOLA SCHAURICH					
//		9	LUCAS EDUARDO VIVAN					
//		10	NIKOLAS SILVA LUNKES					
//		11	RICARDO BONISSONI ROSSETTO					
//		12	WESLEY FICANHA WUNDER
//		
//		
//		CURIBANOS
//		1	DIOGO GUILHERME ROLOFF					
//		2	FELIPE AGUIAR					
//		3	IGOR JOSÉ XAVIER					
//		4	ISAAC ANTONIO GUISOLPHI FILHO					
//		5	LUIS FELIPE RIBEIRO					
//		6	MATHEUS DA SILVA STEFFEN VIEIRA					
//		7	RUAN VICTOR SCHEIDT					
//		8	WESLEY EVANDRO PEREIRA
//		
//		
//		MAFRA
//		1	ANA BEATRIZ SCHNEIDER					
//		2	ANDRÉ VITOR VALERIO					
//		3	ARTHUR HEUKO CIBOK					
//		4	BRUNO EDUARDO CASSIAS BARUZZO					
//		5	ELESSANDER RIBOVSKI					
//		6	GABRIELI DE FÁTIMA RUTHES					
//		7	GIOVANE RODRIGUES DA LUZ					
//		8	LUCAS GABRIEL PSCHEIDT					
//		9	LUCAS SKIBINSKI					
//		10	LUIS FELIPE SQUIOQUET CAMILLO					
//		11	MARIANA SAUER					
//		12	MATHEUS RUCHINSKI SPERKOSKI					
//		13	NICOLAS CARDOSO VILHA DO LAGO					
//		14	PAULO EDESON GONTARSKI JUNIOR					
//		15	RUAN FELIPE DE LIMA

	}

	private static int sorteiaAluno(ArrayList<Integer> indices) {
				
		Random r = new Random();
		int numero = r.nextInt(34);
 
		boolean found = true;

		  while(found==false ){
			for (int i = 0; i < indices.size(); i++) {	
				if (numero == indices.get(i)) {					
					found = true;
				}
			}	
			if (found==true) {
				numero = r.nextInt(34);
			}else {
				found=false;
			
			}
			
		}
		return numero;
	}
		
//		Random r = new Random();
//		int numero = r.nextInt(34);
//		int numeroFinal = numero;
//		boolean sortearNovamente = false;
////		if (indices.get(i) != numero) {
////			numeroFinal = numero;
////			break;
////		} else {
////			numeroFinal = sorteiaAluno(indices);
////		}
//		
//		for (int i = 0; i < indices.size(); i++) {	
//			if ( numero == indices.get(i)) {
//				sortearNovamente = true;
//				break;
//			}else {
//				return numero;
//			}
//		}
//		
//		if (sortearNovamente) {
//			return  sorteiaAluno(indices);
//		}else {
//			return numero;
//		}
		
//		return numeroFinal;


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
	
	
	
	private static ArrayList<String> pegarListaTemas() {

		ArrayList<String> temas = new ArrayList<>();
		temas.add("POSTO COMBUSTIVEL");
		temas.add("PET SHOP");
		temas.add("LOJA DE ROUPAS/MODAS");
		temas.add("LOJA DE MANUTENCAO DE CELULARES");
		temas.add("HOSPITAL");
		temas.add("TRANSPORTADORA");
		temas.add("RESTAURANTE");
//		listaAlunos.add("OP1 E-COMMERCE");
//		listaAlunos.add("OP2 BIBLIOTECA");
//		listaAlunos.add("OP3 SISTEMA ACADEMICO");
//		listaAlunos.add("OP4 LOCADORA");
//		listaAlunos.add("OP5 SISTEMA PARA CONSULTORIOS");
//		listaAlunos.add("OP5 SISTEMA PARA ESCRITORIOS DE ADVOCACIA");
		
		return temas;
		
	}

}
