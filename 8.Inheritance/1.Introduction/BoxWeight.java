

//Inherit Box class into BoxWeight class by extends keyword
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w,double weight){
        super(l,h,w);  //call the parent class constructor. used to initialize values parent in parent class
        //If we not super then defualt constructor will be called

        //suppose Box has a var as same name weight
        //Then super.weight -> it's access the parent class weight and this.weight access the current(child) class
        this.weight = weight;
     }
}