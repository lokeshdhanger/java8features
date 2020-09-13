
interface TestInterface2 {
	public void test2();
}


public class MRToStaticMethod {
	
	public static void m2() {
		System.out.println("m2 called");
	}
	
	public static void main(String[] args) {
		
		TestInterface2 testInterface = MRToStaticMethod::m2;  //MR to static method not need object variable. Can be directly called with class name.
		testInterface.test2();  
		
	}

}
