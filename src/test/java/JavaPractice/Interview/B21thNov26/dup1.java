package JavaPractice.Interview.B21thNov26;

import java.util.TreeSet;

public class dup1 {
    public static void main(String[] args){
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
