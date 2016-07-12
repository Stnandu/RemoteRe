package jdbcA1;

public class Ques10CusExcep extends Exception{
	

	public Ques10CusExcep(){
		super();
		this.initCause(null);
	}
	public Ques10CusExcep(int Balance){
		System.out.println("No minimum balance");
		
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Maintain minimum Account Balance";
	}
	
}	

