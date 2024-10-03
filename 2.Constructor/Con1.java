
//Constructor is specialtype of function in the class
//that run when we create an object and it allocates some variable


import java.util.*;
public class Con1{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                //create an objects of Student class
                //here Student() is constructor
                //And this by default constructor
                Student mehedi = new Student();
 
           
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