
interface TestInterface3 {
	public void test3();
}

interface TestInterface4 {
	public void test4(Integer i);
}

public class MRToConstructor {
	
	public MRToConstructor() {
		System.out.println("default constructor called");
	}
	
	public MRToConstructor(Integer i) {
		System.out.println("parameterized constructor called with i="+i);
	}

	public static void main(String[] args) {
		
		TestInterface3 testInterface3 = MRToConstructor::new;
		testInterface3.test3(); //MR to default constructor
		
		TestInterface4 testInterface4 = MRToConstructor::new;  //MR to parameterised constructor
		testInterface4.test4(5);  // abstract method of FunctionalInterface must be accepting that kind and number of parameters.
	}
}
