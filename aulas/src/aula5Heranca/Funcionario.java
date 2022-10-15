package aula5Heranca;

public class Funcionario extends Pessoa{
	
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
