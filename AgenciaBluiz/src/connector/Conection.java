package connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conection {
	private static String DATABASE_URL = "JDBC:mysql://localhost:3306/agenciabluiz";
	private static String USER = "root";
	private static String PASSWORD = "Mud@r123";
	
	public static Connection createConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
		return conn;
	}
	public static void main(String[] args) throws Exception{
		Connection conn = createConnection();
		
		if(conn != null) {
			System.out.println("Conexao realizada com sucesso!!");
		}else {
			System.out.println("falha na conexao!!");
		}
			
	}
	 
}

