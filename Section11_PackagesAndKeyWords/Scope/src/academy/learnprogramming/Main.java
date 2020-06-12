package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String privateVar="this is private to main";

	    ScopeCheck scopeInstance =new ScopeCheck();
        System.out.println("scopeInstance privateVar is "+scopeInstance.getVarOne());
        System.out.println(privateVar);
        scopeInstance.timesTwo();

        ScopeCheck.InnerClass innerClass=scopeInstance.new InnerClass();  //creating an object of inner class
        innerClass.timesTwo();
    }
}
