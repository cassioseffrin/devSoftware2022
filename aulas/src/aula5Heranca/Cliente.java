package aula5Heranca;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Pessoa implements Serializable{
	
	
	private static final long serialVersionUID = 2L;
	
	public static String ARQUIVO = "/Users/cassioseffrin/cliente.csv";
	public static String ARQUIVOSERIAL = "/Users/cassioseffrin/cliente_serial.obj";
	
	public String telefone;
	
	public ArrayList<Produto> lstProdutos;
	
	
	@Override
	public String toString(){
		return super.toString()+ String.format(";%s",telefone);
	}
	
	
	public void salvar() {
		Utils utils = new Utils();
		utils.salvar(this, ARQUIVOSERIAL);
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public ArrayList<Produto> getLstProdutos() {
		return lstProdutos;
	}


	public void setLstProdutos(ArrayList<Produto> lstProdutos) {
		this.lstProdutos = lstProdutos;
	}
	
	
	
 	
}