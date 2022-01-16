package com.company;
import  java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N%2!=0){
            System.out.println("Weird");
        }
        if (N>2 & N<=5){
            if (N%2==0){
                System.out.println("Not Weird");
            }
        }
        else if (N>6 & N<=20){
            if (N%2==0){
                System.out.println("Weird");
            }

        }


        else if(N>20){
            if (N%2==0){
                System.out.println("Not Weird");
            }

        }

        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // scanner.close();
    }
}
