package jdbcday24;

import java.sql.*;


public class TestResultSet2 {

	public static void main(String[] args) throws SQLException {
		String userName="root";
		String pwd="sAi@2235#dk";
		String url="jdbc:mysql://localhost:3306/sys";
		Connection con=DriverManager.getConnection(url,userName,pwd);

		System.out.println("connected to db");
	
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	
	String selectSql ="Select * from customer";
    ResultSet rs=st.executeQuery(selectSql);
        if(rs.next()) {
        	rs.moveToInsertRow();
        	
        	rs.updateString(2,"Mitchel Lee");
        	rs.updateDouble(3,860);
             rs.insertRow();
             rs.last();
       System.out.println(rs.getInt(1)+ "::"+rs.getString(2)+"::"+rs.getString(3));      
        }
	
	}

	//}
	

}
