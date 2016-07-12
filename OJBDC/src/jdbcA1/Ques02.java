package jdbcA1;

import java.sql.*;


public class Ques02 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException   {
		// TODO Auto-generated method stub
		// Register Driver
	
					
		Class.forName("oracle.jdbc.driver.OracleDriver");
				
			//Connection C = DBConnection.getConnection();	
			//Create Connection
		Connection C = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211");
				//what is that earlier i gave connection name as TIRA 
			
			// Statement
		System.out.println("Statement");
				Statement st = C.createStatement();
			//Execute
				System.out.println("Execute");
				int r = st.executeUpdate("Update employees set first_name = 'Radha' where employee_id = 198");
				st.close();
					System.out.println(r);
						
					C.close();
	
		
				
			
		
	}

	
}
