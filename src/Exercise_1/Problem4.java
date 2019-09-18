package Exercise_1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        System.out.println("Enter a number for pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
        }
    }
}
