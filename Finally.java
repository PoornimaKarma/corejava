package Exception;

public class Finally {

	public static void main(String[] args) {
		try {
			int p = 100/10;
			System.out.println(p);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this is finally block");
		}

		System.out.println("hello");
	}

}
