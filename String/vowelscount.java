package strings;

public class vowelscount {

	public static void main(String[] args) {
	 String s = "poornima vishwkarma";
	 int count = 0;
	 String v = "aeiouAEIOU";
	 for(int i=0;i<s.length();i++)
	 {
		 char c = s.charAt(i);
		 if (v.indexOf(c) != -1) {
             count++;
         }
		 System.out.println("vowels="+c);
	 }
	 System.out.println("vowels="+count);
	}

}
