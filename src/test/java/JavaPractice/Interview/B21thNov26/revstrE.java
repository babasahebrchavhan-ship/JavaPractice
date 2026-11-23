package JavaPractice.Interview.B21thNov26;

import org.testng.annotations.Test;

public class revstrE {
    @Test
    public void Main() {
        String str="My name is don";
        String[] words=str.split(" ");
        String revString="";
        for(int i=0;i<words.length;i++){
            String w=words[i];
            String revWord="";
            if(w.equals(words[3])){
                for(int j=w.length()-1;j>=0;j--) {
                    revWord = revWord + w.charAt(j);
                }
                }
                else{
                 revWord=revWord+words[i];
                }
            revString=revString+revWord+" ";
        }
        System.out.println("Reverse String:"+revString);
    }
}
