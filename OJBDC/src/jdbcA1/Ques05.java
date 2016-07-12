package jdbcA1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class Ques05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection C = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211");
		Statement st = C.createStatement();
		Boolean b = st.execute("Insert into shop2 values(2,'Rice',11)");
		System.out.println(b);
		ResultSet r = st.getGeneratedKeys();
		while(r.next())
		{
			System.out.println(r.rowInserted());
		}
		st.close();
		C.close();
	}

}
