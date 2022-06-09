import java.util.Scanner;
import java.util.Stack;
import java.lang.Character;

public class JavaStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(methodStackJava(input));
         /*   while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());*/
        }

    }

    public static  boolean methodStackJava(String input){

        Stack<Character> stacky = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (!stacky.isEmpty()) {
                switch(input.charAt(i)) {
                    case '}' : if (stacky.peek() == '{') {
                        stacky.pop();
                    } break;
                    case ']' : if (stacky.peek() == '[') {
                        stacky.pop();
                    } break;
                    case ')' : if (stacky.peek() == '(') {
                        stacky.pop();
                    } break;
                    default: stacky.push(input.charAt(i));
                }
            } else {
                stacky.push(input.charAt(i));
            }
        }
       return stacky.isEmpty();
    }
}
