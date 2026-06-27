package Java.day11;

class mobile{
   private  String brand;
  private  int price;
  public void  setname(String brand){
      this.brand=brand;

  }
  public void setprice(int price){
      this.price=price;
    }
    public String getbrand(){
      return this.brand;
    }
    public int getprice(){
      return this.price;
    }
}

public class exercise02 {
    public static void main(String[] args) {
        mobile m1=new mobile();
        m1.setname("samsung");
        m1.setprice(50000);
        System.out.println(m1.getbrand());
        System.out.println(m1.getprice());
    }


}
