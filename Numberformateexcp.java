package Exception;

public class Numberformateexcp {

	public static void main(String[] args) {
		String s="abc";  
		try {
			int i=Integer.parseInt(s);	
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

}
