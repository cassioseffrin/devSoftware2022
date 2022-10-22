package aula5Heranca;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	public static String ARQUIVO = "/Users/cassioseffrin/cliente.csv";
	public static String ARQUIVOSERIAL = "/Users/cassioseffrin/cliente_serial.obj";
	
	public String telefone;
	
	
	@Override
	public String toString(){
		return super.toString()+ String.format(";%s",telefone);
	}
	
	
	public void salvar() {
		Utils.salvar(this, ARQUIVO);
	}
 	
}