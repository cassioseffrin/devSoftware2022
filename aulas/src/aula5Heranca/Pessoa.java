package aula5Heranca;
 
public class Pessoa {
	public final static String ARQUIVO = "/Users/cassioseffrin/pessoa.csv";
	public String nome;
	public String cpf;
	public String rg;
	


	public Pessoa( ){
	 
	}
	
	public Pessoa( String nome ) {
		this.nome=nome;
	}
	
	
	public Pessoa( String nome, String cpf, String rg) {
		this.nome=nome;
		this.cpf=cpf;
		this.rg=rg;
	}

	
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
