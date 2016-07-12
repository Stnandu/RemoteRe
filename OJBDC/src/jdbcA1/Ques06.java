package jdbcA1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ques06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection C = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211");
		Statement st = C.createStatement();
		String sql = "select employee_id from employees where rownum<= 5";
		ResultSet r = st.executeQuery(sql);
		
		
		while(r.next())
		{
			System.out.println(r.getInt("employee_id"));
			
		}
		st.close();
		C.close();
	}

}
