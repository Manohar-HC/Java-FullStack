package Java.day12;
class Vehicle{
    void start(){
        System.out.println("vehicle started");
    }
}
class child extends Vehicle{
    void ride(){
        System.out.println("Bike Riding");
    }
}
public class exercise02 {
    public static void main(String[] args) {
        child c1=new child();
        c1.ride();
        c1.start();
    }
}
