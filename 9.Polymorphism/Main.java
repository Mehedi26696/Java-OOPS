public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        
        shape.area();
        circle.area();
        square.area();
        triangle.area();
        
        Shapes circle1 = new Circle();  

        circle1.area();  // here method overriding happen //here reference var is Shapes(parent) but which method is called depends on object type(Circle) this called upcasting

        //how java determine this(overriding) -> Dynamic method dispatch

        
        Circle.check();

        Shapes test = new Circle();

        test.check();  // we can't override a static method. Override depends on object and static doesn't depends on object
        //we can inherit it but can't override
 
    }
}
