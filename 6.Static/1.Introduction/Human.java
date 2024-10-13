
public class Human{
    int age;
    String name;
    int salary;
    boolean married;

   static long population;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;  //convention
        //this.population +=1; // this will work but not convention
    }
}

//When a variable doesn't depend on object then we set this variable is static