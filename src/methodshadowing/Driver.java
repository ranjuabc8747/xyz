package methodshadowing;

public class Driver {
	public static void main(String[] args) {
		A obj = new A();
		obj.test();
		B obj1=new B();
		obj1.test();
		A obj2=new B();
		obj2.test();
	}
}
