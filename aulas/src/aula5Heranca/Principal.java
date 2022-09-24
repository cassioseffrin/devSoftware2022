package aula5Heranca;

import java.io.File;
import java.io.FileOutputStream;

public class Principal {

	public static void main(String args[]) {
		Farmaceutico farmaceutico = new Farmaceutico();
		farmaceutico.nome = "Jose";
		farmaceutico.cpf = "23456465";
		farmaceutico.rg = "567567567";
		farmaceutico.salvar();
	}

}
