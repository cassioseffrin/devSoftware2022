package aula5Heranca;

public class Principal {
	public static void main(String args[]) {
		Farmaceutico farmaceutico = new Farmaceutico();
		farmaceutico.nome = "Jose";
		farmaceutico.cpf = "23456465";
		farmaceutico.rg = "567567567";
		farmaceutico.salvar();
			
		Cliente cliente = new Cliente();
		cliente.nome = "Pedro";
		cliente.cpf = "23456465";
		cliente.rg = "567567567";
		cliente.telefone="(49))3442-2313";
		cliente.salvar();
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Pessoa Jose";
		pessoa.cpf = "23456465";
		pessoa.rg = "567567567";
		pessoa.salvar();
	}
}

