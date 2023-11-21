import java.util.Stack; //22csu105 Latika Mukhi

public class BalancedParentheses {

public static boolean areParenthesesBalanced(String expression) {
Stack<Character> stack = new Stack<>();

for (char ch : expression.toCharArray()) {
if (ch == '(' || ch == '{' || ch == '[') {
stack.push(ch);
} else if (ch == ')' || ch == '}' || ch == ']') {
if (stack.isEmpty()) {
return false;
}

char openBracket = stack.pop();
if ((ch == ')' && openBracket != '(')
|| (ch == '}' && openBracket != '{')
|| (ch == ']' && openBracket != '[')) {
return false;
 }
}
 }

return stack.isEmpty();  // All parentheses should be balanced.
}

public static void main(String[] args) {
String expression1 = "{[()]()}";
String expression2 = "([)]";
String expression3 = "(((";
System.out.println("Expression 1 is balanced: " + areParenthesesBalanced(expression1));
System.out.println("Expression 2 is balanced: " + areParenthesesBalanced(expression2));
System.out.println("Expression 3 is balanced: " + areParenthesesBalanced(expression3));
    }
}
