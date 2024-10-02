
//We can't destroy object manually in java
// But we can set something to do when object are destroying by java

import java.util.*;
public class int16{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                 A obj;


                // for(int i = 0; i<100;i++)
                //  {
                //     obj = new A();
                //  }

                 for(int i = 0; i<10000000;i++)
                 {
                    obj = new A();
                 }
          }
}

class A{
    int n =90;
    String name ="Liverpool";
    @Override
    protected void finalize() throws Throwable {
      System.out.println("Object are destroyed");
    }
}
