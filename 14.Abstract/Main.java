public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
     
        Daughter daughter =  new Daughter(20);
        daughter.career();

        // Parent mom = new Parent(26);  can't create an object of abstract class

        Parent son2 = new Son(45);
        son2.career();
       
         
        Parent.Greeting();

        son.normal();
    }
}
