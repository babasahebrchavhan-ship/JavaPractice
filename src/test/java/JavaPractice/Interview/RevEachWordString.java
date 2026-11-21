package JavaPractice.Interview;

public class RevEachWordString {
    public static void main(String[] args) {
        String str="I am playwright";
        String []words=str.split(" ");
        String revString="";
        for(int i=0;i<words.length;i++)
        {
            String revWords="";
            String w=words[i];
            for(int j=w.length()-1;j>=0;j--)
            {
                revWords=revWords+w.charAt(j);
            }
            revString=revString+revWords+" ";
        }
        System.out.println("Reverse String:"+revString);
    }
}
