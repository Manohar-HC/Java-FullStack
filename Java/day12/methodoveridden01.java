package Java.day12;
class Animal1{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog2 extends Animal1{
    void sound(){
        System.out.println("Dog says woof");
    }
}
public class methodoveridden01 {
    public static void main(String[] args) {
        Dog2 d=new Dog2();
        d.sound();
    }
}
