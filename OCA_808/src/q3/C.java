package q3;

 public class C extends B{
	 public void test() {
		 System.out.println("C");
	 }
public static void main(String[] args) {
	A a1=new A();
//	a1.test();
//	a1.mtd();
	A a2=new B();
//	a2.test();
//	a2.mtd();
	A a3=new C();
//	a3.test();
//	a3.mtd();
	a1=(A)a3;           //upcasting
	A a4=(B)a3;          //downcasting
	//A a4=(B)a3;
	a1.test();
	a4.test();
	
	
	
}
}
