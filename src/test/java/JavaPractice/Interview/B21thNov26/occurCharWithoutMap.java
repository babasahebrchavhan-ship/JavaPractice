package JavaPractice.Interview.B21thNov26;

public class occurCharWithoutMap {
    public static void main(String[] args){
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
