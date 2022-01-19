package com.company;
import  java.util.Scanner;

public class Loop_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt(); //0
            int b = in.nextInt(); //2
            int n = in.nextInt(); //10
            int sum=0;
            for (int j=1;j<=n;j++){
                sum=sum+b*j;
                System.out.println(sum+a);
            }
        }

        in.close();
    }
}
