import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human mehedi = new Human(34,"Mehedi Hasan");
       // Human twin = new Human(mehedi);

       Human twin = (Human) mehedi.clone();   

       System.out.println(twin.age+" "+twin.name);
       
       
       System.out.println(Arrays.toString(mehedi.arr));
       System.out.println(Arrays.toString(twin.arr));

       twin.arr[0] = 100;

       
       System.out.println(Arrays.toString(mehedi.arr));
       
       System.out.println(Arrays.toString(twin.arr));

    }
}
