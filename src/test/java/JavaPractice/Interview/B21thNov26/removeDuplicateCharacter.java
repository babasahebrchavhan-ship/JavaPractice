package JavaPractice.Interview.B21thNov26;

import org.testng.annotations.Test;

import java.util.TreeSet;

public class removeDuplicateCharacter {
    @Test
    public void Main() {
        String str = "Babasaheb";
        TreeSet<Character> set = new TreeSet<>();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                sf.append(c);
            }
        }

        System.out.println("Set:" + set);
        System.out.println("Non Duplicate Character:" + sf.toString());
    }
}
