
//in java multiple inheritance not possible 
//that's why use interfaces to achieve it

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();

        // car.start();
        // car.acc();
        // car.breake();
        // car.stop();

        //Engine car2 = new Car(); // it's possible

        // car2.start();
        // car2.acc();
        // car2.breake(); // we can't use this because reference of car2 is Engine and object is Car() 
        // car2.a;  //// we can't use this because reference of car2 is Engine and object is Car(). a is defined in Car but reference is Engine 
        // car2.stop();

        // Media car3 = new Car();
        // car3.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        car.upgradeEngine();

        car.start();
        car.startMusic(); 
    }
}
