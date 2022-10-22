package aula5Heranca;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	public final static String ARQUIVO = "/Users/cassioseffrin/pessoa.csv";
	public final static String ARQUIVO_SERIAL = "/Users/cassioseffrin/pessoa_serialv1.obj";
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
