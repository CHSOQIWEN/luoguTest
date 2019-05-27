package com.chaoqiwen.Second;

import java.util.Scanner;

public class ClassTime {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int sum=0;
        int max=0;
        int day=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<8;i++){
             a=scanner.nextInt();
             b=scanner.nextInt();
             sum=a+b;
            if(sum>max&&sum>8){
                max=sum;
                day=i;
            }

        }
        System.out.println(day);
    }
}
