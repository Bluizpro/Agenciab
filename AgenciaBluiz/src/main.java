import java.util.Scanner;

import Modelo.Programa;
import Service.CadastroService;

public class main {
	public static void main(String[] args) {

		CadastroService cadastrar = new CadastroService();

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("======== AgenciaBluiz=========");
			System.out.println("====== Menu=======");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Editat Informa��es");
			System.out.println("3 - Delete");		
			System.out.println("4 - Sair");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				cadastrar.Cadastrar();
				break;
			case 2:
				cadastrar.Update();
				break;
			case 3:
				cadastrar.Delete();
				break;
			case 4:
				break;
			default:
				System.out.println("Numero invalido");
				break;			}
		} while (opcao!= 4);
	}
}
