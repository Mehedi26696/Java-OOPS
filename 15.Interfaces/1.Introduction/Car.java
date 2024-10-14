public class Car implements Engine,Breake,Media{
    
     int a;
    @Override
    public void breake() {
         System.out.println("I break like normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like normal car");
    }
}
