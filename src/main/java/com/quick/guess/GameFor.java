package com.quick.guess;

import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        for (int i=1 ; i<=3 ; i++) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Please enter a number");
            int number = scanner.nextInt();
            System.out.println("第"+i+"次:" + number);
            if (number == -1) {

            }
        }
    }
}
