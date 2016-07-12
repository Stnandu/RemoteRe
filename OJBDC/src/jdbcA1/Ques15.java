package jdbcA1;

public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int AccBal = 150;
		try{
		minBal(AccBal);
		}
		catch(Ques10CusExcep c){
			System.out.println(c.getMessage());
			System.out.println(c.getCause());
		}
		
		
		
		
	}
	public static void minBal(int b) throws Ques10CusExcep
	{
		
			if(b<2000)
				throw new Ques10CusExcep();
			else 
				System.out.println("Acc Balance: "+ b);
	}
	}

