package JavaPractice.Interview.B21thNov26;

import org.testng.annotations.Test;

import java.util.TreeSet;

public class dup1 {
    @Test
    public void Main(){
        String str="babasaheb";
        TreeSet<Character>set=new TreeSet<>();
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<str.length();i++) {
            Character c=str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
            else{
                sb1.append(c);
            }
        }
        System.out.println("Non dup Character:"+sb.toString());
        System.out.println(" dup Character:"+sb1.toString());
    }
}
