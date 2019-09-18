package Exercise_1;

import java.util.Scanner;

public class Problem6 {
    public String checkString(char ch) {
        String ans = "";
        if (Character.isDigit(ch)) {
            ans = "Digit";
        } else if (Character.isAlphabetic(ch)) {
            if (ch >= 'a' && ch <= 'z') {
                ans = "Lower case letter";
            } else {
                ans = "Capital letter";
            }

        } else {
            ans = "special Character";
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println("Enter a character");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        Problem6 prob = new Problem6();
        System.out.println(prob.checkString(ch));
    }
}
