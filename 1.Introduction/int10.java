
//Call constructor from another constructor


import java.util.*;
public class int10{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
            
                // Student mehedi = new Student(24,"Mehedi Hasan",45.78f);
                 
                
                // System.out.println(mehedi.rno); 
                // System.out.println(mehedi.name);  
                // System.out.println(mehedi.marks);  
 


                Student random = new Student();
                
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
    
    Student(){
        //internally it's like : new student(13,"Oscar Bobb",56.45f)
        this(13,"Oscar Bobb",56.45f);
     
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