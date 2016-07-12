package jdbcA1;

import java.net.MalformedURLException;
import java.net.URL;

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "htt://www.google.com";
		try {
			URL link = new URL(s);
			System.out.println(link);
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL");
		}
	}

}
