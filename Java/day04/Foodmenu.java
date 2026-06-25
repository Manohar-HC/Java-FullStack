package Java.day04;
import java.util.Scanner;
public class Foodmenu {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of the food menu");
        int n =sc.nextInt();
        switch (n){
            case 1: System.out.println("Idli");
            break;
            case 2: System.out.println("Dosa");
            break;

            case 3: System.out.println("Biryani");
            break;
            case 4: System.out.println("Coffee");
            break;
            default: System.out.println("invalid choice");
        }
    }
}
