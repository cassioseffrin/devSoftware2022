package aula5Heranca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
	public static void main(String args[]) {
//		Farmaceutico farmaceutico = new Farmaceutico();
//		farmaceutico.nome = "Jose";
//		farmaceutico.cpf = "23456465";
//		farmaceutico.rg = "567567567";
//		farmaceutico.salvar();
//			

		
		
//		ArrayList<Pessoa> listaPessoas = Utils.lerPessoa(Pessoa.ARQUIVO);
//		listaPessoas.forEach( (p)->  System.out.println("Nome: "+p.nome + "  CPF :" +p.cpf)    );
		
		
		
//		Pessoa pessoa = new Pessoa("Maria", "234234", "234234234");
//		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
//		listaPessoas.add(pessoa);
//		Utils u = new Utils();
//		u.serializarLista(listaPessoas, pessoa.ARQUIVO_SERIAL);
		
 
//		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
//		Utils u = new Utils();
// 
//		 List<Pessoa> lst =  ( List<Pessoa> ) u.deserializarLista(Pessoa.ARQUIVO_SERIAL);
//		 System.out.println(lst.size());
		
//		adicionarCliente();
		
		imprimirListaClientes();	
		
	}

	private static void imprimirListaClientes() {
		Utils u = new Utils();
		List<Cliente> lstCliente = (List<Cliente>) u.lerLista(Cliente.ARQUIVOSERIAL);
		for (Cliente c: lstCliente) {
			System.out.println(c.getNome());
		}
	}

	private static void adicionarCliente() {
		Cliente cliente = new Cliente();
		cliente.nome = "Ana";
		cliente.cpf = "23456465";
		cliente.rg = "567567567";
		cliente.telefone="(49)3442-2343";
		
		Produto p = new Produto();
		p.setCodigoBarra(2342342344453L);
		p.setDataFabricacao ( new Date());
		p.setDataValidade (new Date());

		ArrayList<Produto> lstProdutos = new ArrayList<Produto>();
		lstProdutos.add(p);
		cliente.setLstProdutos(lstProdutos);
		
		cliente.salvar();
	}
}

