package Q6;

public class DemoString {
	int v;
	static int s;
	public static void main(String[] args) {
		String[] a= {"A","B","C","D"};
	for (int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
			
			if( a[i].equals("C")) {
				continue;
			}
		System.out.println("work done");
		break;		
			
		}
	}
}


