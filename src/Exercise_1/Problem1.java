package Exercise_1;

import java.util.*;

public class Problem1{
    static boolean checkPalindrome(long num) {
        long rev = 0;
        long temp = num;
        while (temp > 0) {
            rev *= 10;
            rev += temp % 10;
            temp /= 10;
        }
        return rev == num;
    }

    static long sumOfDigits(long num) {
        long sum = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 0)
                sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public String printAns(long num) {
        String ans = "";
        if (checkPalindrome(num)) {
            if (sumOfDigits(num) > 25) {
                ans = num + " is palindrome and the sum of even numbers is greater than 25";
            } else {
                ans = num + " is palindrome and sum of even numbers is less than 25";
            }
        } else {
            ans = num + " is not palindrome";
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println("Enter a number to check palindrome");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        Problem1 prob = new Problem1();
        System.out.println(prob.printAns(number));
    }
}