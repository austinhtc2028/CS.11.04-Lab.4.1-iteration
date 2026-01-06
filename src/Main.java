import java.util.Scanner;

public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
            }
            return count ==0;
        }
    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String a = String.valueOf(n);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++){
            b.append(a.charAt(a.length() - 1 - i));
        }
        return b.toString();
    }


    // 3. encryptThis
    public static String encryptThis(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            int code = word.charAt(0);
            if (word.length() == 1) {
                result.append((int) input.charAt(0));
            } else if (word.length() == 2){
                result.append(code).append(word.substring(word.length() -1)).append(" ");
            }
            else {
                result.append(code).append(word.substring(word.length() - 1)).
                        append(word, 2, word.length() - 1).append(word.charAt(1)).append(" ");

            }
        }
        return result.toString();
    }


    // 4. decipherThis
    public static String decipherThis(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                } else {
                    break;
                }
            }
            int ascii = Integer.parseInt(sb.toString());
            char first = (char) ascii;
            String rest = word.substring(sb.length());
            StringBuilder wordSb = new StringBuilder();
            wordSb.append(first).append(rest.charAt(rest.length() - 1));
            if (rest.length() > 1) {
                wordSb.append(rest, 1, rest.length() - 1).append(rest.charAt(0));
            }
            result.append(wordSb).append(" ");
        }
        return result.toString();
    }
}
