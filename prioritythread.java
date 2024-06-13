package multithreading;

 class prioritythread implements Runnable {

	 @Override
	public void run()
	{
	System.out.println(" check priority thread");
	Thread t = new Thread();
	System.out.println(t.getPriority());
	}
	public static void main(String[] args) {
		prioritythread pt = new prioritythread();
		Thread t = new Thread(pt);
		t.start();
		t.run();
		t.setPriority(21);
		System.out.println(t.getPriority());
		

	}

}
