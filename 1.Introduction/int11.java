

import java.util.*;
public class int11{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
            
                Student mehedi = new Student();
                 
                mehedi.rno = 45;
                mehedi.name = "Mehedi Hasan";
                mehedi.marks = 56.78f;
                System.out.println(mehedi.rno); 
                System.out.println(mehedi.name);  
                System.out.println(mehedi.marks);  

                Student luiz = mehedi;

                luiz.rno = 65;
                luiz.name = "Luiz Diaz";
                luiz.marks = 23.88f;

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