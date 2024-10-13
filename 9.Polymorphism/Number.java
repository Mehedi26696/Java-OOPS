//method overloading
//Compile time polymorphism/static polymorphism

public class Number {
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Number obj = new Number();

        System.out.println(obj.sum(3,4));
        System.out.println(obj.sum(6,8,9));
    }
}
