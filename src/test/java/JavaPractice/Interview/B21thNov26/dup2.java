package JavaPractice.Interview.B21thNov26;

import org.testng.annotations.Test;

public class dup2 {
    @Test
    public  void Main() {
        String str = "babasaheb";
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c)){
                System.out.print(c);
            }
        }
    }
}
