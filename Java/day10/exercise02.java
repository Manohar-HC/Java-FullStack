package Java.day10;
class car{
    String brand;
    int price;

    car(String b,int p){
        brand=b;
            price=p;

    }
}
public class exercise02 {
    public static void main(String[] args) {
        car c1=new car("bmw",5000000);
        System.out.println(c1.brand);
        System.out.println(c1.price);

    }
}
