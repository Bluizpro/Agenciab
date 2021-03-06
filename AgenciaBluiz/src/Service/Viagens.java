package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import Modelo.Destino;
import connector.Conection;

public class Viagens {

	public void salva() {
		Scanner sc = new Scanner(System.in);
		
		Destino viagens = new Destino();
		
		System.out.println("Digite seu Destino");		
		viagens.setDestino(sc.nextLine());
		
		System.out.println("Digite sua data de ida ");
		viagens.setIda(sc.nextLine());
	
		System.out.println("Digite sua data de retorno");
        viagens.setVolta(sc.nextLine());        
        System.out.println("Digite a quantidade de passageiros");
        viagens.setQuantPassagens(sc.nextInt());
        
        String sql = "INSERT INTO Cadastro(Destino, ida, Volta, quantPassageiros) VALUES(?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null; 
        try {
        	conn = Conection.createConnection();
        	pstm = conn.prepareStatement(sql);
        	
        	pstm.setString(1, viagens.getDestino());
        	pstm.setString(2, viagens.getIda());
        	pstm.setString(3, viagens.getVolta());
        	pstm.setInt(4, viagens.getQuantPassagens());
        	
        	System.out.println("Cadastro Efetuado com sucesso");
        	
        	pstm.execute();
        	pstm.close();
        	
        }catch(Exception ex){
        	System.out.println(ex.getMessage());
        	
        }
	}
}
	

