package q96;

public class Worker extends Thread{
	C c;
	public Worker(C c) {
		this.c=c;
	}
	public void run() {
		try {
			c.await();
			System.out.println("worker");
		}catch(Exception e) {
			//e.printStackTrace();
		}
	}
	

}
public class Master implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("master");
	}
public static void main(String[] args) {
	Master m=new Master();
	Worker w=new Worker(c);
	w.start();
	
}
}