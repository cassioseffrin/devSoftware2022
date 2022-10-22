package aula5Heranca;

import java.util.ArrayList;
import java.util.List;
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
//		pessoa.salvar();
//		Utils.lerPessoa(Pessoa.ARQUIVO);
		
		
//		ArrayList<Pessoa> listaPessoas = Utils.lerPessoa(Pessoa.ARQUIVO);
//		listaPessoas.forEach( (p)->  System.out.println("Nome: "+p.nome + "  CPF :" +p.cpf)    );
		
		
		
//		Pessoa pessoa = new Pessoa("Maria", "234234", "234234234");
//		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
//		listaPessoas.add(pessoa);
//		Utils u = new Utils();
//		u.serializarLista(listaPessoas, pessoa.ARQUIVO_SERIAL);
		
 
//		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		Utils u = new Utils();
 
		 List<Pessoa> lst =  ( List<Pessoa> ) u.deserializarLista(Pessoa.ARQUIVO_SERIAL);
		 System.out.println(lst.size());
 
		
	}
}

