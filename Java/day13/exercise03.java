package Java.day13;

class Animalia {

    void eat() {
        System.out.println("Animal Eating");
    }
}

class Dogia extends Animal {

    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Bark");
    }
}

public class exercise03 {

    public static void main(String[] args) {

        Animalia a = new Dogia();

        a.eat();

        a.bark();

    }
}

//it gives error tel me why
