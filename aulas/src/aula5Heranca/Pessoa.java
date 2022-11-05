package aula5Heranca;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	
	private static final long serialVersionUID = 2L;
	
	
	public final static String ARQUIVO = "/Users/cassioseffrin/pessoa.csv";
	public final static String ARQUIVO_SERIAL = "/Users/cassioseffrin/pessoa_serialv1.obj";
	private String nome;
	private String cpf;
	private String rg;
	


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
		Utils utils = new Utils();
		utils.salvar(this, ARQUIVO);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	
	
	
	
	
}
