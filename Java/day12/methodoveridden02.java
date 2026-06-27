package Java.day12;
class Vehicle2{
    void start(){
        System.out.println("Vehicle start");
    }
    class Vehicle3  extends Vehicle2{
        void start(){
            System.out.println("car started");
        }
    }
}
public class methodoveridden02 {

    public static void main(String[] args) {
        Vehicle2 v2=new Vehicle2();
        v2.start();
    }
}
