package pack.thread;

public class RunnableEg implements Runnable{

	public static void main(String[] args) {
		RunnableEg  r = new RunnableEg ();
		RunnableEg  r1 = new RunnableEg ();
		Thread t = new Thread(r);
		Thread t1 = new Thread(r1);
		
		System.out.println("Before Thread0 isAlive : "+t.isAlive());
		
		t.start();
	    System.out.println("After Thread0 isAlive : "+t.isAlive());
		System.out.println("Thread0 starts executing");
		
		t.setPriority(5);
	    System.out.println("Priority of Thread0 is : "+t.getPriority());
	    
		t.setName("Runnable Thread 1");
		System.out.println("New Thread Name is : "+t.getName());
System.out.println();		
		t1.start();
		System.out.println("Thread1 starts executing");
	    
	    t1.setPriority(4);       //12>10 Exception
	    
		System.out.println("Priority of Thread1 is : "+t1.getPriority());
		
		t1.setName("Runnable Thread 2");
		System.out.println("New Thread Name is : "+t1.getName());
		
	}
	public void run() {
		System.out.println("Thread is running : " +Thread.currentThread().getName());
		
	}
}
