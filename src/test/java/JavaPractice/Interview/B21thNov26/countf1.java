package JavaPractice.Interview.B21thNov26;

import java.util.Map;
import java.util.TreeMap;

public class countf1 {
    public static void main(String[] args){
      String str="My name is Babasaheb";
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<str.length();i++) {
            Integer c=map.get(str.charAt(i));
            if(c==null){
                map.put(str.charAt(i),1);
            }
            else{
                map.put(str.charAt(i),++c);
            }
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
