package Exercise_1;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Problem5 {
    public int sumOfNumbers(String st) {
        String[] str = st.split(" ");
        int sum = 0;

        for (String s : str) {
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Enter numbers to get the sum");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Problem5 prob = new Problem5();
        System.out.println(prob.sumOfNumbers(str));
    }

}
