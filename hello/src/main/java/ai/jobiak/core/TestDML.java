package ai.jobiak.core;
import java.sql.*;
public class TestDML {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String userName="root";
		String pwd="sAi@2235#dk";
		String url="jdbc:mysql://localhost:3306/sys";
		Connection con=DriverManager.getConnection(url,userName,pwd);

		System.out.println(con);
	
	Statement st=con.createStatement();
	String insertSql="insert into customer values(368,'sai',345)";
	String insertSql2="insert into customer values(415,'srujana',230)";
	String insertSql3="insert into customer values(9,'naga',789)";
	String insertSql4="insert into customer values(22,'mani',564)";
	String insertSql5="insert into customer values(5,'lucky',787)";
	String insertSql6="insert into customer values(6,'dil',487)";
	String insertSql7="insert into customer values(7,'bhavani',557)";
    String insertSql8="insert into customer values(8,'priya',987)";
    String insertSql9="insert into customer values(9,'sujji',912)";
    String insertSql10="insert into customer values(02,'bujji',980)";

	long count=st.executeUpdate(insertSql);
	long count2=st.executeUpdate(insertSql2);
	long count3=st.executeUpdate(insertSql3);
	long count4=st.executeUpdate(insertSql4);
	long count5=st.executeUpdate(insertSql5);
	long count6=st.executeUpdate(insertSql6);
	long count7=st.executeUpdate(insertSql7);
	long count8=st.executeUpdate(insertSql8);
	long count9=st.executeUpdate(insertSql9);
	long count10=st.executeUpdate(insertSql10);
	System.out.println(count);	
	}

	}


