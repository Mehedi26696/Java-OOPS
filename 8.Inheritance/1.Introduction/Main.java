

import java.util.*;
public class Main{

        public static void main(String[] args)
          {
                 Box box1 = new Box();
                 System.out.println(box1.l+" "+box1.h+" "+box1.w);
                 Box box2 = new Box(4);
                 System.out.println(box2.l+" "+box2.h+" "+box2.w);
                 Box box3 = new Box(6,8.9,3.8);
                 System.out.println(box3.l+" "+box3.h+" "+box3.w);

                 Box box4 = new Box(box3);
                 System.out.println(box4.l+" "+box4.h+" "+box4.w);

                 box4.information();
               
                 BoxWeight box5 = new BoxWeight();
                 System.out.println(box5.l+" "+box5.h+" "+box5.w+" "+box5.weight);
                 BoxWeight box6 = new BoxWeight(4,8,3,9);
                 System.out.println(box6.l+" "+box6.h+" "+box6.w+" "+box6.weight);

              // Which variable can be accessable it's defined by the reffernce of the object not the type of the object
              //    Box box7 =  new BoxWeight(2,4,6,7);
              //    System.out.println(box7.l+" "+box7.h+" "+box7.w+" "+box7.weight);



              
              // there are many variables in both parent and child classes
              // We are given access to variables that are in the ref type i.e. BoxWeight
              // hence, we should have access to weight variable
              // this also means, that the ones we are trying to access should be initialised
              // but here, when the obj itself is of type parent class, how will we call the constructor of child class
              // this is why error
              // BoxWeight box8 = new Box(2, 3, 4);
              // System.out.println(box8);


          }
}


//private var can only accessible on his own file
//parent can't access child methods and instances but child can access parent methods and instances
