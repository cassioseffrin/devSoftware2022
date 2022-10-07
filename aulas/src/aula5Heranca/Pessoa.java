package aula5Heranca;
 
public class Pessoa {
	public final static String ARQUIVO = "/Users/cassioseffrin/pessoa.csv";
	public String nome;
	public String cpf;
	public String rg;	
	
	@Override
	public String toString(){
		return String.format("\n%s;%s;%s",nome,cpf,rg);
	}
		
	public void imprimirPessoa() {
		System.out.printf("\n\nNome: %s\nCPF: %s\nRG: %s",nome,cpf,rg);
	}
		
	public void salvar() {
		Utils.salvar(this, ARQUIVO);
	}

}
