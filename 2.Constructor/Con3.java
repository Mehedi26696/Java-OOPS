

//Add function inside class

import java.util.*;
public class Con3{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
            
                Student mehedi = new Student();
 
                 mehedi.greeting();
                 
                // System.out.println(mehedi.rno); 
                // System.out.println(mehedi.name);  
                // System.out.println(mehedi.marks);  


                 
          }
}

 // create a class
class Student{
    int rno;
    String name;
    float marks;
    
    void greeting(){
        System.out.println("Hello! My name is "+this.name);
    }
    Student(){
        this.rno =13;
        this.name = "Mehedi Hasan";
        this.marks = 56.89f;
    }
}