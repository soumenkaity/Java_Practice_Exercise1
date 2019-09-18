package Exercise_1;

import java.util.*;

public class Problem2 {
    public String checkTomOrJerry(int num) {
        String ans = "";
        if (num > 20 && num < 30) {
            if (num % 2 != 0) {
                ans = "Tom";
            } else {
                ans = "Jerry";
            }
        } else {
            ans = "this number is not between 20 and 30.";
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Problem2 prob = new Problem2();
        System.out.println(prob.checkTomOrJerry(number));
    }
}
