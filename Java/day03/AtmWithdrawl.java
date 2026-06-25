package Java.day03;
import java.util.Scanner;
public class AtmWithdrawl {
    public static void main(String[] args) {
        int balance =30000;
        int withdrawal =5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the amount");
        int amount =sc.nextInt();

        if(withdrawal <balance){
            System.out.println("Withdrawl Sucessfull");
        }
        else{
            System.out.println("insufficient balance");
        }
    }
}
/* HW3 - ATM Program
if(amount>=100)
{
   System.out.println("Withdrawl Sucessfull");
}

⚠️ Logic issue.

Question was:

Balance = ?
Withdraw Amount = ?

Example:

int balance = 5000;
int withdraw = 3000;

Then:

if(withdraw <= balance)*/