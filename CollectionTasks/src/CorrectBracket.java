import java.util.Stack;

public class CorrectBracket {
    Stack stack = new Stack();
    char c;

    boolean isCorrect(String brackets) {
        for (int i = 0; i < brackets.length(); i++) {
            c = brackets.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    public CorrectBracket() {
    }
}
