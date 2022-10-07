package aula5Heranca;

 

public class Cliente extends Pessoa {
	
	public static String ARQUIVO = "/Users/cassioseffrin/cliente.csv";
	
	public String telefone;
	
	
	@Override
	public String toString(){
		return super.toString()+ String.format(";%s",telefone);
	}
	
	
	public void salvar() {
		Utils.salvar(this, ARQUIVO);
	}
 	
}