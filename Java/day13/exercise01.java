package Java.day13;


class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog Bark");
    }
}

public class exercise01 {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();

    }
}