


import java.util.*;
public class Con4{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
            
                Student mehedi = new Student();
                 
                
                mehedi.greeting();
                mehedi.changename("Dominik Solankee");
                mehedi.greeting();

                sc.close();
  


                 
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

    void changename(String newName){
        this.name = newName;
    }
    Student(){
        this.rno =13;
        this.name = "Mehedi Hasan";
        this.marks = 56.89f;
    }
}