

//we know that somethong which is not static belongs to an object
//static can't call a non-static method

//non-static inside static
 
public class Main{

        public static void main(String[] args)
          {   
               //greeting(); //this will give an error
               fun();

               Main obj = new Main();
               obj.greeting();
          }
        //this is not dependent on objects
        static void fun(){
            //greeting(); //this gives an error. Because it requires an instances. But the function using it does not depend on instances
            

            //we cannot access non static stuff without referencting their instances in a static context

            //hence. we are referencing it 
            Main obj = new Main();
            obj.greeting();

        }

        void fun2(){
            greeting();
        }

        void greeting(){
            System.out.println("Hello");
        }
}