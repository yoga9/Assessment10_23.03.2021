package pack.thread;

public class ThreadEg extends Thread{
	
	public static int count = 0;
	public static void main(String[] args) {
	
		ThreadEg t = new ThreadEg();
		ThreadEg t1 = new ThreadEg();
		ThreadEg t2 = new ThreadEg();
		
		t2.setPriority(NORM_PRIORITY);
		System.out.println("Thread Priority : "+t.getPriority());
		
		t2.start();
		System.out.println("Thread0 starts executing :" +Thread.currentThread().getName());
		System.out.println(++count);
		
		
		t.setPriority(MAX_PRIORITY);
		System.out.println("Thread Priority : "+t.getPriority());
		
		t.start();
		System.out.println("Thread1 starts executing :" +Thread.currentThread().getName());
		System.out.println(++count);
		
		t1.setPriority(MIN_PRIORITY);
		System.out.println("Thread Priority : "+t1.getPriority());
		
		t1.start();
		System.out.println("Thread2 starts executing :" +Thread.currentThread().getName());
		System.out.println(++count);
	}
	
	public void run() {
		
		System.out.println("Thread is running");
		System.out.println("Running Thread name is : "+Thread.currentThread().getName());
		
		count++;
		System.out.println("1 :" +count);
		
		count++;
		System.out.println("2 :" +count);
	}
}
