package Patterns_in_java;

import java.util.Scanner;

public class P_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * m) - 1; k++) {
                if (k == 0 || k == (2 * i) || i == m - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }


            }


            System.out.println();

        }


        sc.close();
    }


}
