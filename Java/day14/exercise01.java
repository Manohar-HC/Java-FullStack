package Java.day14;
abstract class vehicle{
    abstract void start();
}
class car extends vehicle{
    void start(){
        System.out.println("Car started");
    }
}
public class exercise01 {
    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
}
