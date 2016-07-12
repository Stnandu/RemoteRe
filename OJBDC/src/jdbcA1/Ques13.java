package jdbcA1;

public class Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			method1(" ");
			
		}
		catch(Exception a){
			a.printStackTrace();
		}
		
	}
	
	public static void method1(String s) throws Exception{
	
			if(s == " ")
			throw new IllegalArgumentException();
		
	}

}
