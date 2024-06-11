package multithreading;

public class multithreading implements Runnable {

	public void run()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(""+i);
		}
	}
	public static void main(String[] args) {
		
		multithreading m = new multithreading();
		Thread t = new Thread(m);
		t.start();
	}

}
