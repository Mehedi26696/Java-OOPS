

 
public class Main{

        public static void main(String[] args)
          {
            
            BoxPrice box1 = new BoxPrice();

            System.out.println(box1.l+" "+box1.h+" "+box1.w+" "+box1.weight+" "+box1.cost);
            
            

            BoxPrice box2 = new BoxPrice(2,4,5);

            System.out.println(box2.l+" "+box2.h+" "+box2.w+" "+box2.weight+" "+box2.cost);

            BoxPrice box3 = new BoxPrice(box2);

            System.out.println(box3.l+" "+box3.h+" "+box3.w+" "+box3.weight+" "+box3.cost);

            
            BoxColor box4 = new BoxColor(2,4,5,4,"Red");

            System.out.println(box4.l+" "+box4.h+" "+box4.w+" "+box4.weight+" "+box4.color);

             


          }
}


//Here BoxWeight inherit Box that is called Single Inheritance

//Here BoxPrice inherit Boxweight and Box weight Inherit Box that is called Multilevel Inheritance

//Here BoxColor and BoxPrice both inherit BoxWeight that is called Hierarchial Inheritance

 
