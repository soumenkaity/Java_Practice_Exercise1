package Exercise_1;

import java.util.Scanner;

public class Problem10 {
    public String stringManipulate(String s, int n) {
        String sub = s.substring(s.length() - n, s.length());
        for (int i = 1; i <= n; i++) {
            s += sub;
        }
        return s;
    }

    public static void main(String[] args){
        System.out.println("Enter a string and a number");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        Problem10 prob = new Problem10();
        System.out.println(prob.stringManipulate(str, n));
    }
}
