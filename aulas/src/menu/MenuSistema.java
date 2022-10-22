package menu;

import java.util.Scanner;

 

public class MenuSistema {

 
		public static void main(String a[]) {
			System.out.println("***** MENU PRINCIPAL *******");
			Scanner scan = new Scanner(System.in);
			System.out.println("1 Cadastros");
			System.out.println("2 Relatorios");
			System.out.println("3 Ajuda");
			System.out.println("0 Sair");
			System.out.print("Digite a operaçao desejada: ");
			int op = scan.nextInt();
	 
 
			if (op == 1) {
				menuCadastro();
			} else if (op == 2) {
//				menuRelatorio();
			}
			scan.close();
		}
		
		
		public static void menuCadastro() {
			Scanner scan = new Scanner(System.in);
			System.out.println("***** MENU CADASTRO *******");
			System.out.println("1 Funcionario");
			System.out.println("2 Fornecedor");
			System.out.println("3 Produos");
			System.out.println("0 Voltar");
			System.out.print("Digite a operaçao desejada: ");
			int op = scan.nextInt();
 
			
			if (op == 1) {
//				irCadastroFuncionar();
				 
			} else if (op == 0) {
//				menuPrincipal();
			}
			scan.close();
		}
		
	}
