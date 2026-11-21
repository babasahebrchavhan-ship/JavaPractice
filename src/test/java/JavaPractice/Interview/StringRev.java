package JavaPractice.Interview;

public class StringRev {
    public static void main(String[] args) {
        String str = "I am playwright";
        String[] words = str.split(" ");
        String revString = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(words[2])) {
                String w = words[i];
                String revWords = "";
                for (int j = w.length() - 1; j >= 0; j--) {
                    revWords = revWords + w.charAt(j);
                }
                revString = revString + revWords + " ";
            } else {
                revString = revString + words[i] + " ";
            }
        }
        System.out.println(revString);
    }
}

