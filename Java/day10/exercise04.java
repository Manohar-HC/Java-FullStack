package Java.day10;

class Mobile{

    String brand;

    Mobile(String brand){

        this.brand=brand;

    }

}

public class exercise04 {

    public static void main(String[] args){

        Mobile m=new Mobile("Samsung");

        System.out.println(m.brand);

    }

}