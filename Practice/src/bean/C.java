package bean;

public class C extends B{

	public void mtd1() {
		System.out.println("in C");
	}
	
	public void mtd4() {
		System.out.println("method of C");
	}
	
	
	public static void main(String[] args) {
		
		A a = new A(); 
		B b = new B();
		C c = new C();
		
		A a1 = new B();
		
		a1.mtd1();
		a1.mtd2();
		
		C a3= new C();
		
		
		
	}
	
	
}
