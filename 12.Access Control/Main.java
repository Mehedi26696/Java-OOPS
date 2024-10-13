public class Main {
    public static void main(String[] args) {
        A obj = new A (10,"Mehedi");

        //1.Access the data members
        //2.Modify the data members
       // obj.num //we can't access like this because num is private

       obj.setNum(23); //set the 

       System.out.println(obj.getNum()); //get the value
    }
}



//public can be accessible it's own class,package,subclass same package,subclass diff package,diff package and not subclass. So it's  anywhere

//protected can be accessible on it's own class,package,subclass same package,subclass diff package 


//when access modifier is default(means we are not specify) then this can only be accessible on it's own package,class,Subclass same package

//private can only be accessible only on that file(class)