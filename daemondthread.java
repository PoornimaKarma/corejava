package multithreading;

public class daemondthread extends Thread {
	public void run(){  
			
		
		  System.out.println("Name: "+Thread.currentThread().getName());  
		 System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
		 }  
	  
		 public static void main(String[] args){  
		  daemondthread t1=new daemondthread();  
		  daemondthread t2=new daemondthread() ; 
		    
		  try {
		      t1.setDaemon(true);//will throw exception here 
		     
		  }
		  catch (Exception e)
		  {
			System.out.println(e);
		  }
		  t2.start();
		  t1.start();
		 }  
}
