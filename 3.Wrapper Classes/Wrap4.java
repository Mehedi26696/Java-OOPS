
//when a non primitive is final we can't re assign it;
import java.util.*;
public class Wrap4{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                Student musa = new Student();

                final Student mehedi = new Student();

                mehedi.rno =13;
                mehedi.name = "Mehedi Hasan";
                mehedi.marks = 56.89f;
                System.out.println(mehedi.rno); 
                System.out.println(mehedi.name);  
                System.out.println(mehedi.marks);  

                // mehedi = musa; not possible


               
          }
}

class Student{
    int rno;
    String name;
    float marks;
}
