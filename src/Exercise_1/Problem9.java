package Exercise_1;

import java.util.Scanner;

public class Problem9 {
    public String reverse(String str) {
        String reverse = "";
        for (char ch : str.toCharArray()) {
            reverse = ch + reverse;
        }
        return reverse;
    }

    public static void main(String[] args){
        System.out.println("Enter a string to reverse");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Problem9 prob = new Problem9();
        System.out.println(prob.reverse(str));
    }
}
