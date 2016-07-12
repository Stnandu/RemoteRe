package jdbcA1;

public class Ques09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "jyothi";
		try{
			s.charAt(s.length());
		}
		catch(NullPointerException n)
		{
			n.printStackTrace();
			System.out.println("String pointer out of bounds");
		}
		catch(StringIndexOutOfBoundsException I){
			StackTraceElement a[] = I.getStackTrace();
			System.out.println("Inside StackTrace");
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
		}
		catch(Exception e)
		{
			System.out.println("Caught exception");
		}
	}

}
