package Java.day13;

class Animia {

    void eat() {
        System.out.println("Animal Eating");
    }
}

class Dogesh extends Animia {

    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Bark");
    }
}

public class exercise02{

    public static void main(String[] args) {

        Dogesh d = new Dogesh();

        d.eat();

        d.bark();

    }
}