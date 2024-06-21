import java.util.Scanner;

public class AmountProgram {
    public static void main(String[] args) {
        int ch;

        int amount = 50000;
        int PINCode = 1234;
        int minimumBalance = 1000;

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Enter Your PIN:");
            int enteredPIN = scanner.nextInt();

            if (enteredPIN == 1234) {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("Enter your choice:");
            } else {
                System.out.println("Incorrect PIN.");
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the deposit amount:");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount > 0) {
                        amount += depositAmount;
                        System.out.println("Deposited " + depositAmount + ". Current balance: " + amount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 2:
                    System.out.println("Enter the withdrawal amount:");
                    int withdrawAmount = scanner.nextInt();
                    int remainingAmount = amount - withdrawAmount;

                    if (remainingAmount >= minimumBalance && withdrawAmount > 0 && withdrawAmount < amount) {
                        amount -= withdrawAmount;
                        System.out.println("Withdrawn " + withdrawAmount + ". Current balance: " + amount);
                    } else if (withdrawAmount >= amount) {
                        System.out.println("Insufficient Amount. Please Check Your Withdrawal Amount.1000");
                    } else {
                        System.out.println("Withdrawal amount exceeds minimum balance requirement or Invalid withdrawal amount.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + amount);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do You Want To CONTINUE?(1 - Yes | 2 - NO)");
            ch = scanner.nextInt();
        } while (ch == 1);
        System.out.println("Thanks! Visit AGAIN.");
    }
}
