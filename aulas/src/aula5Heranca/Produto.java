package aula5Heranca;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;

public class Produto {
	
	public Long codigoBarra;
	public Long lote;
	public LocalDate dataFabricacao;
	public LocalDate dataValidade;
	public Float valor;
	
	
	public String getProdutoCSV() {
		return String.format("\n%s;%s;%s;%s;%s ",codigoBarra,lote,dataFabricacao,dataValidade,valor);
	}
	
	public boolean salvar() {
		String arquivo = "/Users/cassioseffrin/produto.csv";
		File f = new File(arquivo);
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
			fos.write(getProdutoCSV().getBytes());
			fos.flush();
			fos.close();
			return true;
		} catch(Exception excessao) {
			System.out.println("opa, nao foi possivel criar o arquivo: "+ arquivo);
			System.out.println(excessao.getMessage());
			return false;
		}		
	}
	
}
