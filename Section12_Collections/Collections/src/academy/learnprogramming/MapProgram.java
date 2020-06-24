package academy.learnprogramming;

import java.util.HashMap;
import java.util.Map;

public class MapProgram{
    public static void main(String[] args) {
        Map<String,String>languages=new HashMap<>();
        languages.put("Java","compiled high level language");
        languages.put("Python","high level language with dynamic semantics");
        languages.put("Algol","an algorithmic language");
        languages.put("BASIC","Beginners All Purposes Symbol Instruction Code");
        languages.put("Lisp","Therein Lies Madness");

        System.out.println(languages.get("Java"));
        languages.put("Java","this overwrites initial value"); //overwrites
        System.out.println(languages.get("Java"));
        //to prevent overwriting just use a if else block
        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else {
            languages.put("Java","new overwrite");
        }
        System.out.println("==================================");
        for (String key:languages.keySet()) {
            System.out.println(key+" : "+languages.get(key));
        }
 }
}
