
// We want to run two methods of two diffrerent classes at the same time.
// We can do this using threads.
// We can create two threads and run the methods of the two classes at the same time.

class A extends Thread {
    // public void show(){
    // for(int i=0;i<10;i++){
    // System.out.println("A");
    // }
    // }

    // run() is a method of Thread class which is used to run the thread.
    public void run() {
        for (int i = 1; i <=1000; i++) {
            System.out.println("This is in Thread A");
            System.out.println("Thread A is running");
            System.out.println();
        }
    }
}

class B extends Thread {
    // public void show(){
    // for(int i=0;i<10;i++){
    // System.out.println("B");
    // }
    // }

    // run() is a method of Thread class which is used to run the thread.
    public void run() {
        for (int i = 1; i <=1000; i++) {
            System.out.println("This is in Thread B");
            System.out.println("Thread B is running");
            System.out.println();
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();

        obj1.start(); // start() is a method of Thread class which is used to start the thread.
        obj2.start(); // start() is a method of Thread class which is used to start the thread.

    }
}