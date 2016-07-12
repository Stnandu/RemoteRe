package jdbcA1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Ques03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Connection C = DBConnection.getConnection();	
		//Create Connection
	Connection C = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211");
			//what is that earlier i gave connection name as TIRA 
		
		// Statement
	
			Statement st = C.createStatement();
		//Execute
			
			String sql = "Update employees set first_name = 'Radha' where employee_id = 198";
			String sql1 = "select first_name from employees where employee_id = 198";
			System.out.println(st.execute(sql1));
	
			System.out.println(st.executeUpdate(sql));
			
			
			
			
				//System.out.println(r);
				C.commit();	
				C.close();
	}

}
