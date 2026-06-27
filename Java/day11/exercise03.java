package Java.day11;
class bank{
    private int Balance;
    public void setbalance(int balance){
        this.Balance=Balance;
    }
  public int getbalance(){
        return this.Balance;
  }
}
public class exercise03 {
    public static void main(String[] args) {
        bank b1=new bank();
        b1.setbalance(1000000);
        System.out.println(b1.getbalance());
    }
}
