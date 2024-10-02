import java.util.*;
public class int2{
       
        

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                //create an objects of Student class
                //here Student() is constructor
                Student mehedi = new Student();
                 
 

                
                System.out.println(mehedi.rno); 
                System.out.println(mehedi.name);  
                System.out.println(mehedi.marks);  


                 
          }
}

 // create a class
class Student{
    int rno = 89;
    String name = "Mehedi Hasan";
    float marks = 56.89f;
}