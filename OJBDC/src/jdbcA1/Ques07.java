package jdbcA1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ques07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection C = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211");
		Statement st = C.createStatement();
		String sql = "select employee_id,first_name from employees where rownum<=30 order by first_name";
		ResultSet r = st.executeQuery(sql);
		
		
		while(r.next())
		{
			System.out.println(r.getInt("employee_id")+ " "+ r.getString("first_name"));
			
		}
		st.close();
		C.close();
	}

}
