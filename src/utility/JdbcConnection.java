package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection 
{
public static void main(String[] args) throws Exception
	{
	String host="localhost";
	String port="3306";
	String URL="jdbc:mysql://"+host+":"+port+"/qadb";
	Connection conn = DriverManager.getConnection(URL,"root","admin123");
	Statement s = conn.createStatement();
	ResultSet rs = s.executeQuery("select *from employee where name='rahul'");
	rs.next();
	System.out.println(rs.getString("name"));
	}
public static void Dbconnect(String dbname,String query) throws Exception
{
	String host="localhost";
	String port="3306";
	String URL="jdbc:mysql://"+host+":"+port+dbname;
	Connection conn = DriverManager.getConnection(URL,"root","admin123");
	Statement s = conn.createStatement();
	ResultSet rs = s.executeQuery(query);
	rs.next();
	System.out.println(rs.getString("name"));
}
}
