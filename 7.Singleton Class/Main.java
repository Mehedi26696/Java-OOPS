
import java.util.*;
public class Main{

        public static void main(String[] args)
          {
               //Singleton obj = new Singleton(); //this will give an error

               Singleton obj = Singleton.getInstance();

               Singleton obj2 = Singleton.getInstance();

               Singleton obj3 = Singleton.getInstance();

               // all 3 ref variables are pointing to just one object
          }
}
