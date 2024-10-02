
// constructor overloading


import java.util.*;
public class int8{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
            
                Student mehedi = new Student(24,"Mehedi Hasan",45.78f);
                 
                
                System.out.println(mehedi.rno); 
                System.out.println(mehedi.name);  
                System.out.println(mehedi.marks);  

                Student gakpo = new Student();

                System.out.println(gakpo.rno); 
                System.out.println(gakpo.name);  
                System.out.println(gakpo.marks); 
  


                 
          }
}

 // create a class
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.rno =49;
        this.name = "Fedrico Dimarco";
        this.marks = 67.78f;
    }


    
    // when the argument and variable name is same we have to put this. Otherwise it won't work
    Student(int rno,String name,float marks){
        this.rno =rno;
        this.name = name;
        this.marks = marks;
    }
}