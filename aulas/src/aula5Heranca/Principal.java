package aula5Heranca;

import java.util.ArrayList;
import java.util.Random;

public class Principal {
	public static void main(String args[]) {
//		Farmaceutico farmaceutico = new Farmaceutico();
//		farmaceutico.nome = "Jose";
//		farmaceutico.cpf = "23456465";
//		farmaceutico.rg = "567567567";
//		farmaceutico.salvar();
//			
//		Cliente cliente = new Cliente();
//		cliente.nome = "Pedro";
//		cliente.cpf = "23456465";
//		cliente.rg = "567567567";
//		cliente.telefone="(49))3442-2313";
//		cliente.salvar();
//		Pessoa pessoa = new Pessoa("Maria", "234234", "234234234");
//		pessoa.salvar();
//		Utils.lerPessoa(Pessoa.ARQUIVO);
		
		
		ArrayList<Pessoa> listaPessoas = Utils.lerPessoa(Pessoa.ARQUIVO);
		listaPessoas.forEach( (p)->  System.out.println("Nome: "+p.nome + "  CPF :" +p.cpf)    );
		
		
		
		
		Random r = new Random();
		int minimo = 1;
		int maximo = 35;
		int numero = r.nextInt(maximo-minimo) + minimo;
		
		
		System.out.println(numero);
		
		
		
		
		
//		ArrayList<String> listaAlunos = new ArrayList<>();
//		listaAlunos.add("CAUÃ FILIPE GRAFF");
//		listaAlunos.add("ERIK KNOBLAUCH RICKWARDT");
//		listaAlunos.add("FELIPE DO AMARAL ANTONIAK");
//		listaAlunos.add("FELIPE GABRIEL HINKEL");
//		listaAlunos.add("GUILHERME GABRIEL CAMBRI FERRI");
//		listaAlunos.add("IGOR RENOSTO TONDELLO");
//		listaAlunos.add("JOÃO PEDRO WEBBER");
//		listaAlunos.add("LÁZARO PIOLA SCHAURICH");
//		listaAlunos.add("LUCAS EDUARDO VIVAN");
//		listaAlunos.add("NIKOLAS SILVA LUNKES");
//		listaAlunos.add("RICARDO BONISSONI ROSSETTO");
//		listaAlunos.add("WESLEY FICANHA ");
//		listaAlunos.add("DIOGO GUILHERME ROLOFF");
//		listaAlunos.add("FELIPE AGUIAR");
//		listaAlunos.add("IGOR JOSÉ XAVIER");
//		listaAlunos.add("ISAAC ANTONIO GUISOLPHI FILHO");
//		listaAlunos.add("LUIS FELIPE RIBEIRO");
//		listaAlunos.add("MATHEUS DA SILVA STEFFEN VIEIRA");
//		listaAlunos.add("RUAN VICTOR SCHEIDT");
//		listaAlunos.add("WESLEY EVANDRO ");
//		listaAlunos.add("ANA BEATRIZ SCHNEIDER");
//		listaAlunos.add("ANDRÉ VITOR VALERIO");
//		listaAlunos.add("ARTHUR HEUKO CIBOK");
//		listaAlunos.add("BRUNO EDUARDO CASSIAS BARUZZO");
//		listaAlunos.add("ELESSANDER RIBOVSKI");
//		listaAlunos.add("GABRIELI DE FÁTIMA RUTHES");
//		listaAlunos.add("GIOVANE RODRIGUES DA LUZ");
//		listaAlunos.add("LUCAS GABRIEL PSCHEIDT");
//		listaAlunos.add("LUCAS SKIBINSKI");
//		listaAlunos.add("LUIS FELIPE SQUIOQUET CAMILLO");
//		listaAlunos.add("MARIANA SAUER");
//		listaAlunos.add("MATHEUS RUCHINSKI SPERKOSKI");
//		listaAlunos.add("NICOLAS CARDOSO VILHA DO LAGO");
//		listaAlunos.add("PAULO EDESON GONTARSKI JUNIOR");
//		listaAlunos.add("RUAN FELIPE DE LIMA");
		
		
		
		
		
		
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
}

