package com.chaoqiwen.Third;

import java.util.Scanner;

public class CountOne {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        int count=0;
        int a=0;
        for(int i=1;i<=n;i++) {
            a=i;
            while (a!=0){
                int b=a%10;

                if(b==x){
                    count++;
                }

                a=a/10;
            }
        }
        System.out.println(count);


    }
}
