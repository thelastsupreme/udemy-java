package academy.learnprogramming;

public class ScopeCheck {
    public int publicVar=0;
    private int varOne =1;

    public ScopeCheck() {
        System.out.println("Scope check created publicVar = "+publicVar+" : privateVar = "+ varOne);
    }

    public int getVarOne() {
        return varOne;
    }
    public void timesTwo(){
      int varTwo=2;
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+" times two is "+i*varTwo);
        }
    }
    public class InnerClass{
        public int varThree =3;

        public InnerClass(){
            System.out.println("Inner class created, PrivateVar is "+ varThree);
        }
        public void timesTwo(){
           // int privateVar=2;
            for (int i = 0; i <10 ; i++) {
                System.out.println(i+" times two is "+i* varThree);
//                System.out.println(i+" times two is "+i*ScopeCheck.this.privateVar); //if u wanna access the privateVar of the enclosing class
            }
        }
    }

}
