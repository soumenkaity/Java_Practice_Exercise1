package Exercise_1;

import java.util.*;

public class Problem7 {
    String compare(int a, int b) {
        if (a > b) {
            return "True";
        } else {
            return "False";
        }
    }

    public String sortNumber(int n) {

        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        int sum = 0;
        for (char c : ch) {
            if (((int) c) % 2 == 0) {
                sum += (int) c - (int) '0';
            }
        }
        String str = "";
        for (char c : ch) {
            str = c + str;
        }
        return "Sorted number in non-increasing order : " + str + "\n" +
                "Sum of even numbers : " + sum + "\n" + compare(sum, 15);

    }

    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Problem7 prob = new Problem7();
        System.out.println(prob.sortNumber(number));
    }
}
