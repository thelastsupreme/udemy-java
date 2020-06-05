package academy.learnprogramming;

public class Main {

    private  static  final String INVALID_MESSAGE ="Invalid Value";
    public static void main(String[] args) {
	    String s=getDurationString(62,45);
	    String s1=getDurationString(-90);
        System.out.println(s);
        System.out.println(s1);
    }
    public static String getDurationString(int minutes,int seconds){
        if(minutes>=0){
            if(seconds>=0&&seconds<59){
                int hours=minutes/60;
                minutes%=60;
                return hours+"h"+minutes+"m"+seconds+"s";
            }
            return INVALID_MESSAGE;
        }
        return INVALID_MESSAGE;
    }
    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minutes=seconds/60;
            int rem_seconds=seconds%60;
            return getDurationString(minutes,rem_seconds);
        }
        return INVALID_MESSAGE;
    }

}
