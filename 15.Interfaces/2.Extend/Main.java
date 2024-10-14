public class Main implements B {

    @Override
    public void fun() {
         System.out.println("I am in A");
    }

    @Override
    public void greet() {
         System.out.println("I am in B");
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
       // obj.greeting(); not possible

       obj.greet();

    }
}

//If we want override then parent should be lesser than override method

// if parent method is protected then override have to protected or public can not private
