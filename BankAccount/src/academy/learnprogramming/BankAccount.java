package academy.learnprogramming;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructor, constructor can be overloaded(as long as different parameters)
    public BankAccount(){
        this("009", 2, "Default name", "Default address", "default phone"); // this is optional, and it must be the
        // first line. it will call the other constructor and set the value for it
        System.out.println("Empty constructor called");
    }

    //with constructor, you don't need the setter; it's the major constructor, and other constructor will call this
    // constructor
    public BankAccount(String accountNumber, int balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //constructor: how to execute with some parameters, not all parameters ;  can use command + N
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999", 100, customerName, email, phoneNumber);
    }

    //这里没有balance的parameter，所以this.balance实际上和balance一样；为了延续性，我们就加了this
    public void deposit(int depositNumber){
        this.balance += depositNumber;
        System.out.println("After deposit " + depositNumber);
        System.out.println("You total account is " + this.balance);
    }

    public void withdraw(int withdrawNumber){
        if(withdrawNumber > this.balance){
            System.out.println("Not enough money");
        } else {
            this.balance -= withdrawNumber;
            System.out.println("After withdraw " + withdrawNumber);
            System.out.println("You total account is " + this.balance);
        }
    }

    //--------getter and setter------------------------------------
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
