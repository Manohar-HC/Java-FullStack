package Java.day10;
class carr{
    String brand;
    int price;

    carr(String brand,int price){
      this.  brand=brand;
       this. price=price;

    }
}
public class exercise06 {
    public static void main(String[] args) {
        carr c1=new carr("bmw",5000000);
        System.out.println(c1.brand);
        System.out.println(c1.price);

    }
}
