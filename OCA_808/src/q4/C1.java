package q4;

public class C1 extends C2 implements I{

	@Override
	public void displayI() {
		System.out.println("C1");
		
	}
	public static void main(String[] args) {
		C2 obj1=new C1();
		I obj2=new C1();
//		obj1.displayC2();
//		obj2.displayI();
		C2 s= (C2) obj2;
		I t= (I) obj1;
		s.displayC2();
		t.displayI();
	}

}
