package strings;

public class CountChar {

	public static void main(String[] args) {
		
	        String s1 = "poornima karma";
	        char targetChar = 'm';
	        int count = 0;

	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) == targetChar) {
	                count++;
	            }
	        }

	        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
	    }
	

	}


