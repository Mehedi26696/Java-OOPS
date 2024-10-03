
//this

import java.util.*;
public class Con5{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
            
                Student mehedi = new Student(24,"Mehedi Hasan",45.78f);
                 
                
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
    
    // Student(int roll,String nam,float score){
    //     rno =roll;
    //     name = nam;
    //     marks = score;
    // }



    // Student(int roll,String nam,float score){
    //     this.rno =roll;
    //     this.name = nam;
    //     this.marks = score;
    // }


    
    // when the argument and variable name is same we have to put this. Otherwise it won't work
    //Student mehedi = new Student(24,"Mehedi Hasan",45.78f);
    //here this will replace by mehedi
    Student(int rno,String name,float marks){
        this.rno =rno;
        this.name = name;
        this.marks = marks;
    }
}