
public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public,static and final
        // since it's final we can't create child enums
        // type is week

        //inheritance not possible
        

        //this is not public or protected,so omly privste or default
        //why? because we don't want to create new objects

        //Internally it's like: public static final Week Monday = new Week()
        Week(){
            System.out.println("Constructor called for  "+this);
        }

        @Override
        public void hello(){
            System.out.println("hey hello");
        }
    }
  
    

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }

        System.out.println(week);

        System.out.println(week.ordinal());

        week.hello();
    }
}