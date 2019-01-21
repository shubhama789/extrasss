package q96;

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
