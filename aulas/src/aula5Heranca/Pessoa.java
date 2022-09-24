package aula5Heranca;

import java.io.File;
import java.io.FileOutputStream;

public class Pessoa {
	
	public String nome;
	public String cpf;
	public String rg;
		
	public void imprimirPessoa() {
		System.out.printf("\n\nNome: %s\nCPF: %s\nRG: %s",nome,cpf,rg);
	}
	
	public String getPessoaString() {
		return String.format("\n\nNome: %s\nCPF: %s\nRG: %s",nome,cpf,rg);
	}

	public String getPessoaCSV() {
		return String.format("\n%s;%s;%s",nome,cpf,rg);
	}
	
	public boolean salvar() {
		String arquivo = "/Users/cassioseffrin/pessoa.csv";
		File f = new File(arquivo);
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
			fos.write(getPessoaCSV().getBytes());
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
