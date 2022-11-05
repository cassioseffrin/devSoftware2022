package aula5Heranca;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Produto implements Serializable{
	
	
	private static final long serialVersionUID = 2L;
	
	public static String ARQUIVO = "/Users/cassioseffrin/cliente.csv";
	
	private Long codigoBarra;
	private Long lote;
	private Date dataFabricacao;
	private Date dataValidade;
	private Float valor;
	
	@Override
	public String toString() {
		return String.format("\n%s;%s;%s;%s;%s ",codigoBarra,lote,dataFabricacao,dataValidade,valor);
	}
	
	public void salvar() {
		Utils utils = new Utils();
		utils.salvar(this, ARQUIVO);
	}
	
	public void setCodigoBarra(Long codigoBarra) {
		if (codigoBarra < 1000000000) {
			System.out.println("codigo invalido");
		}else {			
			this.codigoBarra = codigoBarra;
		}
	}
	
	public Long getCodigoBarra() {
		return this.codigoBarra;
	}

	public Long getLote() {
		return lote;
	}

	public void setLote(Long lote) {
		this.lote = lote;
	}

 

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}
	
	
	
	
	
	
	
	
	
}
