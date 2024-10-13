
//outside class can not be static

//inner class can be static

//non-static variable this cannot be referenced from a static context
//that's why we have to add static infront of class
public class InnerClasses{

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args){
        Test a = new Test("Mehedi");
        Test b = new Test("Cooper");


        System.out.println(a.name);
        System.out.println(b.name);
    }
         
}
