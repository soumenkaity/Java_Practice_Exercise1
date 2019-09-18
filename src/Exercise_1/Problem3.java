package Exercise_1;

import java.util.*;

public class Problem3 {
    public String checkType(String str) {
        String ans = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                ans += "Error : Number ";
            } else if ("aeiouAEIOU".indexOf(String.valueOf(ch)) >= 0) {
                ans += "Vowel ";
            } else {
                ans += "Consonant ";
            }
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println("Enter string to check each character is Vowel or Consonant");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Problem3 prob = new Problem3();
        System.out.println(prob.checkType(str));
    }
}
