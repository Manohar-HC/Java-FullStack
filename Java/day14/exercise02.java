package Java.day14;
abstract  class animal{
    abstract void sound();
}
class dog extends animal{
    void sound(){
        System.out.println("woff");
    }
}
public class exercise02 {
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
    }
}
