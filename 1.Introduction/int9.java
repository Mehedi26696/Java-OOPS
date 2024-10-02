
// contructor that takes value from another object


import java.util.*;
public class int9{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
            
                Student mehedi = new Student(24,"Mehedi Hasan",45.78f);
                 
                
                System.out.println(mehedi.rno); 
                System.out.println(mehedi.name);  
                System.out.println(mehedi.marks);  
 


                Student random = new Student(mehedi);
                
                System.out.println(random.rno); 
                System.out.println(random.name);  
                System.out.println(random.marks);  
  


                 
          }
}

 // create a class
class Student{
    int rno;
    String name;
    float marks;
    
    //Student random = new Student(mehedi);
    //here this will replace by random and other will replace by mehedi
    Student( Student other){
        this.rno =other.rno;
        this.name =other.name;
        this.marks =other.marks;
        
    }

  


    
    // when the argument and variable name is same we have to put this. Otherwise it won't work
    // Student mehedi = new Student(24,"Mehedi Hasan",45.78f);
    //here this will replace by mehedi
    Student(int rno,String name,float marks){
        this.rno =rno;
        this.name = name;
        this.marks = marks;
    }
}