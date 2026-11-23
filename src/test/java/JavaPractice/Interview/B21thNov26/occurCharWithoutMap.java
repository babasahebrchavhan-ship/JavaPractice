package JavaPractice.Interview.B21thNov26;

import org.testng.annotations.Test;

public class occurCharWithoutMap {
    @Test
    public  void Main(){
        String str="Babasaheb";
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++) {
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+"-"+freq[str.charAt(i)]);
        }
    }
}
