
//If a class has a single abstract entity then the class has to define as abstract


//If I know method has to be override then we make it abstract

//we can't create abstract method(because static method can't be overriding) but we create static method in abstract class

//We can't put final before abstract class but we could define a final method inside the abstract class

//Multiple inheritance not possible in abstract

public abstract class Parent {
    
     int age;

     public Parent(int age){
        this.age = age;
     }
     
     // cant't create abstract constructors
    //  abstract Parent(){

    //  }

    static void Greeting(){
        System.out.println("Hello");
    }

    void normal(){
        System.out.println("This is a normal method");
    }
    abstract void career ();
    abstract void partner ();
  
}