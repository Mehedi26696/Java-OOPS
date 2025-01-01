
 
public class Main{

        public static void main(String[] args)
          {   
               System.out.println(Human.population); //it will print 0


               Human mehedi = new Human(45,"Mehedi Hasan",3000,true);

               System.out.println(Human.population); //it will print 1 

               Human aurnob = new Human(60,"Aurnob",6000,false);

               System.out.println(mehedi.age);
               System.out.println(mehedi.name);
               System.out.println(mehedi.salary);
               System.out.println(mehedi.married);  
               System.out.println(Human.population); //this is convention  ////it will print 2
               //System.out.println(mehedi.population); //this will work


               
               System.out.println(aurnob.age);
               System.out.println(aurnob.name);
               System.out.println(aurnob.salary);
               System.out.println(aurnob.married); 
               System.out.println(Human.population);
              // System.out.println(aurnob.population);  ////it will print 2

               
          }
}


// Both java file in the same package so we do not need to use import statement for importing
