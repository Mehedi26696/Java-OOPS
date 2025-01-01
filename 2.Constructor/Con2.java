
//Creating constructor


//Constructor is specialtype of function in the class
//that run when we create an object and it allocates some variable


import java.util.*;
public class Con2{
       
        

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

                sc.close();
                 
          }
}

 // create a class
class Student{
    int rno;
    String name;
    float marks;


    //this is constructor
    // we need a way to add the values of the above
    //properties object by object

    //we need one word to access every object
    // for this we need a keyword -> 'this'
    Student(){
        this.rno =13;
        this.name = "Mehedi Hasan";
        this.marks = 56.89f;
    }
}