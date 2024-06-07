package strings;

public class basics {
	public static void main(String args[])
	{
		String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
		String st = "poornima";
		char[] c = {'p','o','o','r','n','i','m','a'};
		
		char[] c1 = {'4','5','8','5'};
		
		String s = "poornima";
		
		String sc = "hello world";		 
		
		String s3 = "karma";
		
		String ss = String.format(s3,"hi",123);
		
		String s1 = new  String ("poornima");
		
		String fruits = String.join(" ", "Orange", "Apple", "Mango");
				
		int i = s.codePointAt(2);
	
		System.out.println(myStr.replaceAll(myStr, "dog"));
		System.out.println(sc.indexOf("world"));
		System.out.println(fruits);
		System.out.println(i);
		System.out.println(s.compareTo(s3));
		System.out.println(s.compareTo(s1));
		System.out.println(s.concat(s1));
		System.out.println(ss);
		System.out.println(c+""+c1);
		
	}

}
