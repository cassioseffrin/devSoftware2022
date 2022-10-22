package aula5Heranca;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	public static String ARQUIVO = "/Users/cassioseffrin/funcionario.csv";
	
	
	public String pis;
	public String passep;
	public String carteiraTrabalho;
	public Float salario;
	
	
	
	@Override
	public String toString(){
		return super.toString()+ String.format(";%s;%s;%s;%s",pis, passep, carteiraTrabalho,salario);
	}
	
	
	public void salvar() {
		Utils.salvar(this, ARQUIVO);
	}


}
