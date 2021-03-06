package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import connector.Conection;
import Modelo.Programa;

public class CadastroService {

	public void Cadastrar() {
	
		Scanner sc = new Scanner(System.in);
		Programa programa = new Programa();
		
        
		System.out.println("Digite seu nome!");
		programa.setNome(sc.nextLine());
		System.out.println("Digite seu Email ");
		programa.setEmail(sc.nextLine());
		System.out.println("Digite uma senha forte!!!!");
		programa.setSenha(sc.nextInt());
		sc.nextLine();
		
		String sql = "INSERT INTO Login(nome, email, senha ) VALUES(?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = Conection.createConnection();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, programa.getNome());
			pstm.setString(2, programa.getEmail());
			pstm.setInt(3, programa.getSenha());

			System.out.println("Cadastro Efetuado com sucesso");

			pstm.execute();
			pstm.close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
	}

	public static void Update() {
		Scanner entrada = new Scanner(System.in);
		String AdicionarEmail, AdicionarNome, AdicionarNomeNovo;
		int trocaSenha = 0, opcao = 0, item;
		{
			System.out.println("O quer precisa ser altereado?, l1 - nome , p3- senha, p4 - exit");
			item = entrada.nextInt();
		}
		while (item != 1 && item != 2 && item != 3 && item != 4);

		if (item == 1) {
			System.out.println("Digite o novo nome a ser Alterado");
			AdicionarNomeNovo = entrada.nextLine();
			entrada.nextLine();
			
			System.out.println("Digite o antigo nome a ser alterado? ");
			AdicionarNome = entrada.nextLine();
			
			
			String sql = "UPDATE login SET nome =  ? WHERE nome like ? ";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			try {

				conn = Conection.createConnection();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1,AdicionarNomeNovo );
				pstm.setString(2, AdicionarNome);

				System.out.println(" O nome foi alterado!!! ");

				pstm.execute();
				pstm.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		} else if (item == 2) {
			System.out.println(" Digite a nova senha:");
			trocaSenha = entrada.nextInt();

			String sql = "INSERT INTO login(senha)VALUES(?)";

			Connection conn = null;
			PreparedStatement pstm = null;
			try {
				conn = Conection.createConnection();
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1, trocaSenha);

				System.out.println("A Senha  foi alterada!!!");

				pstm.execute();
				pstm.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		} else {
			System.out.println("N?o tivemos nada alterado");
		}
	}

	public void Delete() {
		Scanner sc = new Scanner(System.in);	

	
			System.out.println("Digite o seu nome");
			String nome = sc.nextLine();

			String sql = "DELETE from login  WHERE nome like ?";

			Connection conn = null;
			PreparedStatement pstm = null;
			try {

				conn = Conection.createConnection();
				pstm = conn.prepareStatement(sql);

				pstm.setString(1, nome);
				System.out.println("Cadastro Deletado...... Podemos ajudar em algo mais? ");

				pstm.execute();
				pstm.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		}
	}


