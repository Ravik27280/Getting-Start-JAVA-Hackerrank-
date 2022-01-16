package com.company;
import java.util.Scanner;
public class JavaOutputFormat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<1;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.print(s1);
            for(int j=s1.length();j<16;j++){
                System.out.print(" ");
            }

            System.out.printf("%4d",x);


        }
        System.out.println("================================");

    }
}
