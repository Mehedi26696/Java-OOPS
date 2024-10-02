


//class is a blueprint or a template for creating objects. It defines a set of properties (fields) and behaviors (methods) that the objects created from the class will have.
//objects is a instances of class


//class-> logical construct
//object -> physical reality //this will occupy space in memory





import java.util.*;
public class int1{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                //create an objects of Student class
                //here Student() is constructor
                Student mehedi = new Student();
                 
                System.out.println(mehedi);  //by default it's give some random number
                System.out.println(mehedi.rno); //by default it's 0
                System.out.println(mehedi.name); ////by default it's null
                System.out.println(mehedi.marks); //by default it's 0.0

                //naccess value by (.) 

                mehedi.rno =13;
                mehedi.name = "Mehedi Hasan";
                mehedi.marks = 56.89f;

                System.out.println(mehedi);  
                System.out.println(mehedi.rno); 
                System.out.println(mehedi.name);  
                System.out.println(mehedi.marks);  


                 
          }
}

 // create a class
class Student{
    int rno;
    String name;
    float marks;
}