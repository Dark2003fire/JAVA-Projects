import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*;


public class Conn {
	
	
	Connection Conn = null;
	Statement s = null ;
	ResultSet rs = null;
	Conn() throws ClassNotFoundException {
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			String dbURL = "jdbc:sqlserver://hitesh;databaseName=universitymanagementsystem";
			
			 String user = "hitesh";
	         String password = "admin";
	         
	         
	        	 
	        	 Connection Conn = DriverManager.getConnection(dbURL, user , password);
	        	 
	        	 
	        	 String Sql = "Select * From login ";
	        	// Statement st = conn.createStatement();
	        	// ResultSet rs = st.executeQuery(Sql);
	        	 
	        	 /*int count = 0;
	        	 while(rs.next()) {
	        		 count++;
	        		 String name = rs.getString("username");
	        		 String pass = rs.getString("password");
	        		 
	        		 System.out.println();
	        	 }
	        	 */
	        	 
	        	/* String Sql = "Insert into login(username , password)"
	        			      +"VALUES ('admin' , '12345')";
	        			      */
	        	 
	        	
	        	 
	        	 
	        
	        
	         
	         s = Conn.createStatement();
			
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		finally {
            try {
                if (Conn != null && !Conn.isClosed()) {
                    Conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
		
	}

	public static void main(String[] args) {
		

	}
	
	
	 

}










/*
 package net.codejava.jdbc;
 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
 

public class JdbcSQLServerConnection {
 
    public static void main(String[] args) {
 
        Connection conn = null;
 
        try {
 
            String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
            String user = "sa";
            String pass = "secret";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
 * */

