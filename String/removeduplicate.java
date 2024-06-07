package strings;

public class removeduplicate {

	public static void main(String[] args) {

		String s1 = "poornima karma";
		String a  = "";
		for(int i = 0;i<s1.length();i++)
		{
			boolean b = false;
			for(int j = 0;j<a.length();j++)
			{
				if(a.charAt(j)==s1.charAt(i))
				{
					b=true;
					break;
				}
			}
				if(!b)
				{
					a= a+s1.charAt(i);
				}
			
			}
			
		System.out.println("output="+a);
		}
		
}


