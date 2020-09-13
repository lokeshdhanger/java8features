package java8features;


/**
 * functional Interface with @FunctionalInterface annotation
 * @author Lokesh
 *
 */
@FunctionalInterface
interface TestInterface1 {
	public void test1();
}

/**
 * functional interface with no @FunctionalInterface annotation
 * @author Lokesh
 *
 */
interface TestInterface2 {
	public void test2(int i);
}



/**
 * this is also a Functional Interface, as it has only one abstract method.
 * <br>
 * NOTE: 
 * <ul>
 * 	<li> @FunctionalInterface annotation is optional, if interface have only one abstract method </li>
 * 	<li> An interface having 2 or more abstract methods cannot be a functional interface </li>
 * 	<li> A functional Interface can have as many as default methods and static methods. </li>
 * 	<li> A functional interface along with one abstract method can have abstract methods of Object class.
 * 		As any class implementing the Functional interface would also be inheriting the methods of Object class
 * 		So, implementation of Object class will takes place.	
 * 	</li>
 * </ul>	
 * @author Lokesh
 *
 */
public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		TestInterface1 t1 = ()->System.out.println("test1 called");  //using lambda expression
		t1.test1();
		
		
		
		TestInterface2 t2 = System.out::println; //using method reference
		t2.test2(5);
		
	}

}
