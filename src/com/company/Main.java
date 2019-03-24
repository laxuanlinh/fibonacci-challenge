package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int max = scanner.nextInt();
        ArrayList<Integer> fi = new ArrayList();
        int current = 1;
        int first = 1, second = 1;
        int i = 0;
        if (max == 1) {
            System.out.println(current);
        }

        while(current < max){
            System.out.println(current);
            i++;
            if (i < 2){
                continue;
            }
            current = first+second;
            first = second;
            second = current;
        }
    }
}
