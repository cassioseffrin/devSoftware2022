package aula5Heranca;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;

public class Produto {
	
	public static String ARQUIVO = "/Users/cassioseffrin/cliente.csv";
	
	public Long codigoBarra;
	public Long lote;
	public LocalDate dataFabricacao;
	public LocalDate dataValidade;
	public Float valor;
	
	@Override
	public String toString() {
		return String.format("\n%s;%s;%s;%s;%s ",codigoBarra,lote,dataFabricacao,dataValidade,valor);
	}
	
	public void salvar() {
		Utils.salvar(this, ARQUIVO);
	}
	
}
