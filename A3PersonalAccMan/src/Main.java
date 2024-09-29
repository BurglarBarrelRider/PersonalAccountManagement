import java.util.Scanner;

enum TransactionType {
    DEPOSIT,
    WITHDRAWAL
}

class Amount {
    double amount;
    TransactionType transactionType;

    Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }
}

class PersonalAccount {
    // final для обозначения того, что переменная, метод или класс не могут быть изменены после их инициализации
    private final int accountNumber;
    private final String accountHolder;
    private double balance;
    private final Amount[] transactions;
    private int transactionCount;

    PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        this.balance = 0.0;

        this.transactions = new Amount[150]; // фиксированное количемство
        this.transactionCount = 0;
    }

    void deposit(double amount) {
        balance += amount;
        transactions[transactionCount++] = new Amount(amount, TransactionType.DEPOSIT);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions[transactionCount++] = new Amount(amount, TransactionType.WITHDRAWAL);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    double getBalance() {
        return balance;
    }

    String getAccountHolder() { // to access accountHolder
        return accountHolder;
    }

    void printTransactionHistory() {
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i].transactionType + ": " + transactions[i].amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Асан Усен");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) Депозит сумма");
            System.out.println("2) Withdraw (снять сумму)");
            System.out.println("3) Check balance");
            System.out.println("4) Print TransactionHistory");
            System.out.println("5) Endline");
            System.out.print("Choose 1-5: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 4:
                    account.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Error overload, try again.");
            }
        }
    }
}
