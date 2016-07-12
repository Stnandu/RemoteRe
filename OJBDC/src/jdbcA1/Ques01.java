package jdbcA1;

import java.sql.*;


public class Ques01 {

	//public static final String connect = "jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211"; 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
 // Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
	//Create Connection
		Connection C = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211");
		
	// Statement
		Statement st = C.createStatement();
	//Execute
		ResultSet r = st.executeQuery("select * from employees");
		
		while(r.next())
		{
			String Empno = r.getString("First_Name");
			System.out.println(Empno);
		}
		C.commit();
		C.close();
	}

}
