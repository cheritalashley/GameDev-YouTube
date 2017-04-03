package youTube;

public class ThreadMain {

	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadClass("one"));
		Thread t2=new Thread(new ThreadClass("two"));
		Thread t3=new Thread(new ThreadClass("three"));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
