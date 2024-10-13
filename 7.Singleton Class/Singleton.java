
//only one object can be created
//that's why we use private keyword in Singleton constructor. Because then this constructor can't be called from outside the class
public class Singleton{

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        //check whether 1 obj only created or not

        if(instance == null){
            instance = new Singleton();
        }
        
        return instance;
    }

}