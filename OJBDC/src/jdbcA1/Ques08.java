package jdbcA1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Ques08 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection C = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.193:1521:PNLS","spagidi","Oracle_0211");
		
		String sql = "Insert into shop2 values(?,?,?) ";
	
		try{
			PreparedStatement st = C.prepareStatement(sql);
			int s = 3,cost = 120;
			String item = "Oven";
			st.setString(2, item);
			st.setInt(1, s);
			st.setInt(3, cost);
			int i = st.executeUpdate();
			System.out.println(i);
			st.setString(2, "pitcher");
			st.setInt(1, 4);
			st.setInt(3, 30);
			i = st.executeUpdate();
			System.out.println(i);
			st.setString(2, "suasage");
			st.setInt(1, 9);
			st.setInt(3, 5);
			i = st.executeUpdate();
			System.out.println(i);
			
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		C.close();
	}

}
