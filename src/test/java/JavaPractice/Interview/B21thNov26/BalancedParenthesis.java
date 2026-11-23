package JavaPractice.Interview.B21thNov26;

import org.testng.annotations.Test;

import java.util.Stack; // Import Stack class

public class BalancedParenthesis { // Main class
    @Test
    public void Main() { // Main method

        String str = "{[(<>)]}"; // Input string

        Stack<Character> stack = new Stack<>();
        // Create Stack to store opening brackets

        for (int i = 0; i < str.length(); i++) {
            // Loop through each character

            char ch = str.charAt(i);
            // Get current character

            if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                // Check whether character is an opening bracket

                stack.push(ch);
                // Push opening bracket into Stack

            } else {
                // If character is a closing bracket

                if (stack.isEmpty()) {
                    // Check whether Stack is empty

                    System.out.println("Not Balanced");
                    return; // Stop program
                }

                char top = stack.pop();
                // Remove the last opening bracket

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[') ||
                        (ch == '>' && top != '<')) {
                    // Check whether opening and closing brackets match

                    System.out.println("Not Balanced");
                    return; // Stop if brackets do not match
                }
            }
        }

        if (stack.isEmpty()) {
            // Check whether all opening brackets are matched

            System.out.println("Balanced");

        } else {

            System.out.println("Not Balanced");
            // Opening brackets are still remaining
        }
    }

}