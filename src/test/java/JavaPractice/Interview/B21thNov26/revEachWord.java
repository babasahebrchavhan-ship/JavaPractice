package JavaPractice.Interview.B21thNov26;

public class revEachWord {
    public static void main(String[] args){
        String str="Reverse each word in a string";
        String[] words=str.split(" ");
        String revString="";
        for(int i=0;i<words.length;i++){
            String w=words[i];
            String revWords="";
            for(int j=w.length()-1;j>=0;j--){
                revWords=revWords+w.charAt(j);
            }
            revString=revString+revWords+" ";
        }
        System.out.println(revString);
    }
}
