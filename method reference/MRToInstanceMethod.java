interface TestInterface1 {
    public void test1();
}

interface TestInterface5 {
    public void test5(int i);
}

public class MRToInstanceMethod {


    public void m1(){
        System.out.println("m1 called");
    }
    
    public void m2(int i){
        System.out.println("m2 called with i="+i);
    }

    public static void main(String[] args) {
        
        MRToInstanceMethod obj = new MRToInstanceMethod();
        TestInterface1 testInterface =  obj::m1;
        testInterface.test1();
        
        TestInterface5 testInterface5 = obj::m2;
        testInterface5.test5(5);

    }

}