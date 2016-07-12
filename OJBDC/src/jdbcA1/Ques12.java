package jdbcA1;

public class Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			method1(null);
			
		}
		catch(IllegalArgumentException i){
			System.out.println(" Exception caught");
			i.printStackTrace();
		}
		catch(Exception a){
			a.printStackTrace();
		}
		
	}
	
	public static void method1(String s) throws Exception{
	
			if(s == null)
			throw new IllegalArgumentException();
		
	}

}
