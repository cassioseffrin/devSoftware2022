package aula5Heranca;

import java.io.Serializable;

public class Farmaceutico extends Funcionario implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	public static String ARQUIVO = "/Users/cassioseffrin/farmaceutico.csv";
	
	public String registroAnvisa;
	
	
	@Override
	public String toString(){
		return super.toString()+ String.format(";%s",registroAnvisa);
	}
	
	
	public void salvar() {
		Utils utils = new Utils();
		utils.salvar(this, ARQUIVO);
	}
	

}
