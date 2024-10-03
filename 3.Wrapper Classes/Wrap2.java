
import java.util.*;
public class Wrap2{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                Integer a = 5;
                Integer b = 10;

                swap(a,b);
                //It's not swappin though passing Ineger(object) is pass by reference. Cause the keyword final that is used do define Integer class
                System.out.println(a+" "+b);
          }
        public static void swap (Integer a, Integer b){

            Integer temp = a;
            a = b;
            b = temp;
        }
}
