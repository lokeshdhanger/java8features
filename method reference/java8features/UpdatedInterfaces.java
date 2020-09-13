package java8features;


@FunctionalInterface
interface TestInterface3 {
	
	public void test3();
	
	default void m1() {
		System.out.println("default impl of m1");
	}
	
	default int m1(int i) {
		System.out.println("default overloaded m1(), parameter i="+i+" , updated value="+2*i);
		return 2*i;
	}
	
	default void m2(String name) {
		System.out.println("default impl of m2 name="+name);
	}
	
}

/**
 * class implementing the functional interface, will be overriding only on abstract method present there.
 * <br>
 * default methods are optional to override.
 * @author Lokesh
 *
 */
class Test1 implements TestInterface3 {

	@Override
	public void test3() {
		System.out.println("overloaded test3");
	}
	
	/**
	 * it is optional to override default methods
	 */
	public void m1() {
		System.out.println("different m1 implementations");
	}
	
	public void m2(int i) {
		System.out.println("overloaded default method i="+i);
	}
	
	
	
}

public class UpdatedInterfaces {
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.test3();
		
		t1.m1(); //this will be of Test1 class, not of interface
		
		int m1 = t1.m1(4); 
		System.out.println(m1);
		
		t1.m2("lokesh"); //it is interface's default method
		
		t1.m2(5); //overloaded default method
	}

}
