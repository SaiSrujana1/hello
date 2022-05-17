package jdbcday24;

import java.sql.*;


public class TestResultSet {

	public static void main(String[] args) throws SQLException {
		String userName="root";
		String pwd="sAi@2235#dk";
		String url="jdbc:mysql://localhost:3306/sys";
		Connection con=DriverManager.getConnection(url,userName,pwd);

		System.out.println("connected to db");
	
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	
	String selectSql ="Select * from customer";
    ResultSet rs=st.executeQuery(selectSql);
        rs.afterLast();
		rs.previous();
		System.out.println(rs.getString(1)+" :: "+rs.getString(2)+" :: "+rs.getString(3));
		rs.first();	
		System.out.println(rs.getString(1)+" :: "+rs.getString(2)+" :: "+rs.getString(3));
		rs.next();	
		System.out.println(rs.getString(1)+" :: "+rs.getString(2)+" :: "+rs.getString(3));
		rs.absolute(8);
		System.out.println(rs.getString(1)+" :: "+rs.getString(2)+" :: "+rs.getString(3));
	
	}

	//}
	

}
