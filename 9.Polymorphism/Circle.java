//method overriding

public class Circle extends Shapes {

    //this will run when obj of Circle is created
    //hence it is overriding the parent method
    @Override  //this is called annotation(it's check if the method is overriding or not, if not then it will give error)
    void area(){
        System.out.println("Area is pi*r*r");
     }

   // @Override  we can't override a static method
    static void check(){
        System.out.println("I am in circle");
    }
}
