import java.sql.*;
import java.util.Properties;
import java.io.*;

public class StudentJDBC {

	public static void main(String[] args)throws SQLException {
		
		
		Connection conn = null;
		Statement smt = null;
		ResultSet rs = null;
		
		try {
			
			/*
			Class.forName("org.postgresql.Driver");
			String dburl = "jdbc:postgresql://localhost/mydb";
			String user = "Hitesh";
			String pass = "543256";
			conn = DriverManager.getConnection(dburl , user , pass);
			*/
			/*
			String url = "jdbc:postgresql://localhost/mydb";
			Properties props = new Properties();
			props.setProperty("user", "fred");
			props.setProperty("password", "secret");
			props.setProperty("ssl", "true");
			conn  = DriverManager.getConnection(url, props);
			*/
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb " ,"postgres" ,"543256");
			//String url = "jdbc:postgresql://localhost/?user=Hitesh&password=543256&ssl=true";
			//conn = DriverManager.getConnection(url);
			
			if(conn==null) {
				System.out.println("Connection failed");
				
			
				
			}
			else {
				System.out.println("Connection Successful");
				smt = conn.createStatement();
				rs = smt.executeQuery("SELECT * FROM coachx");
				while(rs.next()) {
					System.out.print("Coachx_id = "+rs.getInt(1));
					
					
				}
				conn.close();
				
				
			}
			

			
			
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
