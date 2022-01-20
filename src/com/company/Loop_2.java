package com.company;
import  java.util.Scanner;

public class Loop_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp=1;
            for (int j=1;j<=n;j++){
                sum=sum+(b*temp);
                System.out.print(sum+a+" ");
                temp=temp*2;
            }
            sum=0;
            System.out.println();
        }

        in.close();
    }
}
