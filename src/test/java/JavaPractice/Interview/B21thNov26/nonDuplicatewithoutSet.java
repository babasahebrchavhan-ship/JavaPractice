package JavaPractice.Interview.B21thNov26;

public class nonDuplicatewithoutSet {
    public static void main(String[] args) {
        String str = "Babasaheb";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
