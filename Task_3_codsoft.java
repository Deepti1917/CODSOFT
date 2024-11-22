import java.util.Scanner;

class Task_3_codsoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total_amount = 700000;
        Atm ob = new Atm(total_amount, sc);

        while (true) {
            System.out.println("Welcome to ATM! What do you want to do? \n1) Withdraw Amount \n2) Deposit Amount \n3) Check Balance \n4) Exit");
            int a = sc.nextInt();
            switch (a) {
                case 1 -> ob.withdraw();
                case 2 -> ob.deposit();
                case 3 -> ob.check_balance();
                case 4 -> {
                    System.out.println("Thank you for using the ATM");
                    sc.close();
                    return; 
                }
                default -> System.out.println("Enter a valid option");
            }
        }
    }
}

class Atm {
    long withdrawing_amount, dep_amt;
    long current_amt;
    Scanner sc;

    public Atm(long initialAmount, Scanner scanner) {
        this.current_amt = initialAmount;
        this.sc = scanner;
    }

    void withdraw() {
        System.out.println("Enter the amount to be withdrawn (only 100, 200, and 500):");
        withdrawing_amount = sc.nextLong();
        if (withdrawing_amount > 25000) {
            System.out.println("Withdrawal limit exceeded!");
        } else if (current_amt < withdrawing_amount) {
            System.out.println("Insufficient Balance!");
        } else {
            current_amt -= withdrawing_amount;
            System.out.println("Amount withdrawn = " + withdrawing_amount + "\nCurrent Balance = " + current_amt);
        }
    }

    void deposit() {
        System.out.println("Enter amount to be deposited:");
        dep_amt = sc.nextLong();
        current_amt += dep_amt;
        System.out.println("Amount deposited = " + dep_amt + "\nCurrent Balance = " + current_amt);
    }

    void check_balance() {
        System.out.println("Current balance = " + current_amt);
    }
}