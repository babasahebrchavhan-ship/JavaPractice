package JavaPractice.Interview.B21thNov26;

import org.testng.annotations.Test;

public class nonDuplicatewithoutSet {
    @Test
    public  void Main() {
        String str = "Babasaheb";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
