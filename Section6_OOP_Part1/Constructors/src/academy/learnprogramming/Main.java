package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount=new Account();
        Account newAccount=new Account("1234",0.0,"Bob","pra@23","90321");
//        redundant
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob");
        Account timAccount=new Account("Tim","pra@112","8932849");
        System.out.println(timAccount.getAccountNumber());

//        bobsAccount.withdrawal(100);
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(34.5);
    }
}
