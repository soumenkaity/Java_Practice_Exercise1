package Exercise_1;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args){
        boolean exit_check = false;
        Scanner sc = new Scanner(System.in);
        int num;
        while(!exit_check) {
            System.out.println("<==================================================>");
            System.out.println("Enter 1 to check whether a given number is palindrome or not");
            System.out.println("Enter 2 to whether a number is within a given range or not");
            System.out.println("Enter 3 to check characters of a string is vowel or consonant");
            System.out.println("Enter 4 to print a pattern from a number");
            System.out.println("Enter 5 to print sum of some given integers");
            System.out.println("Enter 6 to check whether a given character is digit or lower case letter or capital letter or special character");
            System.out.println("Enter 7 to sort digits of a number and print sum of even digits of the number");
            System.out.println("Enter 8 to guess a number whether it matches with original number");
            System.out.println("Enter 9 to reverse a given string");
            System.out.println("Enter 10 to create a new string from a given string appending with last n digits repeated n times where n is given");
            System.out.println("Enter 0 to exit");
            System.out.println("<==================================================>");

            num = sc.nextInt();
            switch (num) {
                case 0:
                    exit_check = true;
                    break;
                case 1:
                    Problem1.main(null);
                    break;
                case 2:
                    Problem2.main(null);
                    break;
                case 3:
                    Problem3.main(null);
                    break;
                case 4:
                    Problem4.main(null);
                    break;
                case 5:
                    Problem5.main(null);
                    break;
                case 6:
                    Problem6.main(null);
                    break;
                case 7:
                    Problem7.main(null);
                    break;
                case 8:
                    Problem8.main(null);
                    break;
                case 9:
                    Problem9.main(null);
                    break;
                case 10:
                    Problem10.main(null);
                    break;
                default:
                    System.out.println("Please Enter Correct Input");
                    break;
            }
        }
    }
}
