package academy.learnprogramming;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("5678",2.50,"defName","defAddress","defPhone");
        System.out.println("Empty Constructor Called");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55,customerName,customerEmailAddress,customerPhoneNumber);
    }

    public Account(String accountNumber, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account with params called");

//        do not use setters rather use this. assignment
//        setAccountNumber(accountNumber);
//        setBalance(balance);
//        setCustomerName(customerName);
//        setCustomerEmailAddress(customerEmailAddress);
//        setCustomerPhoneNumber(customerPhoneNumber);

        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmailAddress=customerEmailAddress;
        this.customerPhoneNumber=customerPhoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance-withdrawalAmount<0){
            System.out.println("Only "+balance+" Available..WithDrawl not processed");
        }else {
            this.balance-=withdrawalAmount;
            System.out.println("Updated balance is "+this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
