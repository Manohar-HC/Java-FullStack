package Java.day11;

class Bankk {

    private int balance;

    public void setBalance(int balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Exercise04 {

    public static void main(String[] args) {

        Bankk b1 = new Bankk();

        b1.setBalance(-5000);

        System.out.println(b1.getBalance());

    }
}