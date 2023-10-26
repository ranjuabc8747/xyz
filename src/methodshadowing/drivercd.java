package methodshadowing;

public class drivercd {

	public static void main(String[] args) {
		C obj1 = new C();
		obj1.test();
		D obj2=new D();
		obj2.test();
		D obj3=new D();
		obj3.test();
		

	}

}
