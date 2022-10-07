package aula5Heranca;

import java.io.File;
import java.io.FileOutputStream;

public class Utils {
	
	public static <T> boolean salvar(T entidade, String arquivo) {
		File f = new File(arquivo);
		try {
			FileOutputStream fos = new FileOutputStream(f, true);
			fos.write(entidade.toString().getBytes());
			System.out.println("o arquivo: "+ arquivo +" foi gravado com sucesso!");
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
