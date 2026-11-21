package JavaPractice.Interview.B21thNov26;

import java.util.*;
import java.lang.*;

public class OccurranceOfCharacter {
    public static void main(String[] args) {
        String str = "ocurrance of character";
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        for(int i = 0;i<str.length();i++)
        {
            Integer c=map.get(str.charAt(i));
            if(c==null) {
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),++c);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }


}

