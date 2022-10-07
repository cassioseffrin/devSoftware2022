package aula5Heranca;

public class Farmaceutico extends Funcionario{
	
	
	public static String ARQUIVO = "/Users/cassioseffrin/farmaceutico.csv";
	
	public String registroAnvisa;
	
	
	@Override
	public String toString(){
		return super.toString()+ String.format(";%s",registroAnvisa);
	}
	
	
	public void salvar() {
		Utils.salvar(this, ARQUIVO);
	}
	

}
