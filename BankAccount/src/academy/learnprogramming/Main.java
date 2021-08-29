package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountNumber("001");
//        bankAccount.setCustomerName("John");
//        bankAccount.setBalance(100);
//        BankAccount bankAccount = new BankAccount("001", 0, "Peter", "1@2.com", "212343333434");
        System.out.println("BankAccount constructor with parameters called.");
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(20);
        bankAccount.withdraw(10);
        bankAccount.withdraw(130);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "234343");
        System.out.println(timsAccount.getAccountNumber() + " and the name is " + timsAccount.getCustomerName());
    }
}
