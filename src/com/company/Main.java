package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inp = scan.nextLine().split(" ");
        for (int i = 0; i < inp.length; i++) {
            if (i == 0) {
                System.out.print(inp[i] + " is first, ");
            }
            else if (i == inp.length-1) {
                System.out.print(inp[i] + " is last.");
            }
            else {
                System.out.print(inp[i] + " is after " + inp[i-1] + " and before " + inp[i+1] + ", ");
            }
        }
    }
}
