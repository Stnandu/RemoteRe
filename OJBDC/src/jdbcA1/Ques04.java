package jdbcA1;

import java.sql.*;


public class Ques04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection C = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211");
		Statement st = C.createStatement();
		Boolean b = st.execute("CREATE table shop2( S_no number,item varchar(20),Cost number(10))");
		System.out.println(b);
		st.close();
		C.close();
	}

}
