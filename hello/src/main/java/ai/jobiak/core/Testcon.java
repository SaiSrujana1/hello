package ai.jobiak.core;

import java.sql.*;

public class Testcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="root";
		String pwd="sAi@2235#dk";
		String url="jdbc:mysql://localhost:3306/sys";
		
        
		 
				try {
					Connection con =DriverManager.getConnection(url,userName,pwd);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// TODO Auto-generated catch block
				
			// TODO Auto-generated catch block
		
		System.out.println("naga connected to database...");
	}

}
