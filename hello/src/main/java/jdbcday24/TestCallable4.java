package jdbcday24;

import java.sql.*;


public class TestCallable4 {

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
	CallableStatement stmt2=con.prepareCall("{?=call addalance(?,?)}");
	stmt2.registerOutParameter(1, Types.BOOLEAN);
	stmt2.setInt(2, 10001);
	stmt2.setDouble(3, 500);
	stmt2.executeUpdate();
	System.out.println(stmt2.getBoolean(1));
	}

	//}
	

}
