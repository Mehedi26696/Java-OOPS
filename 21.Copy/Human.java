
public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[] {4,6,7,8,9};
    }

    
    // @Override
    // public Object clone() throws CloneNotSupportedException{

    //     //this called shallow copy
    //     return super.clone();
    // }

       
    @Override
    public Object clone() throws CloneNotSupportedException{

        //this called shallow copy
        Human twin = (Human)super.clone(); //this is shallow copy

        //make deep copy

        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}