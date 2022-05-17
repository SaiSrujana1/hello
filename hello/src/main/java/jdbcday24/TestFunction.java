package jdbcday24;

import java.sql.*;


public class TestFunction {

	public static void main(String[] args) throws SQLException {
		String userName="root";
		String pwd="sAi@2235#dk";
		String url="jdbc:mysql://localhost:3306/sys";
		Connection con=DriverManager.getConnection(url,userName,pwd);

		System.out.println("connected to db");
	
	CallableStatement cs=con.prepareCall("{updateBalance(?,?)}");
	cs.setInt(1, 105);
	cs.setDouble(2,400);
	
	
	boolean result=cs.execute();
	System.out.println(result);
	}

	//}
	

}
