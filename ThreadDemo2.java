package THREAD;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread t=new Thread(new Job());
		t.start();
	}

}
class Job implements Runnable{
	@Override
	public void run() {
		System.out.println("thread execution logic");
	}
}

