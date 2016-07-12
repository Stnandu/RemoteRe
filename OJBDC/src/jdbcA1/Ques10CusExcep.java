package jdbcA1;

public class Ques10CusExcep extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

