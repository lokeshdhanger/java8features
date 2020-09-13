 
interface TestInterface6 {
	public void test6();
}

public class MRToInstanceMethod2 {
	
	public void m6(int i) {
		System.out.println("m1 called with i="+i);
	}
	
	public static void main(String[] args) {
		MRToInstanceMethod2 demo  = new MRToInstanceMethod2();
		
		/**
		 * here if we try to method reference an instance method and corresponding functional
		 * interface do not have an abstract method with matching parameters, then
		 * there appears a compilation error.
		 * 
		 * The type MRToInstanceMethod2 does not define m6() that is applicable here
		 */
		
		TestInterface6 testInterface6 = demo::m6;
		
	}
}
