

public interface A {

    //static interface method should always have body because it can't be override
    //call via the interfaces name
    static void greeting(){
        System.out.println("I am static method");
    }
    void fun();
}
