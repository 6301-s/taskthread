class Thread1 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("hi");
		
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
	          System.out.println("thread1 is interrupted");
	}
		}
}
}
class Thread2 implements Runnable {
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("hello");
		
		try {
			Thread.sleep(1000);

	}
		catch(InterruptedException e) {
			System.out.println("thread2 is interrupted");
}
		}
}
}
public class DemoThread  {
	public static void main(String args[]) throws Exception {
		Thread1 obj1=new Thread1();
		Thread2 obj2=new Thread2();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
		t1.interrupt();
		t2.interrupt();
		t1.join();
		t2.join();
		System.out.println("exit");
		
	}
}
