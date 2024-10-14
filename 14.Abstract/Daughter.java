public class Daughter extends Parent {

    public Daughter(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("I am going to be a actress");
    }

    @Override
    void partner( ){
       System.out.println("I love someone and he is 20");
    }
}