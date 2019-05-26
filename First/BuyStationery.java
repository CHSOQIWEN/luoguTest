package com.chaoqiwen.First;

import java.util.Scanner;

public class BuyStationery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=a*10+b;
        int d=c/19;
        System.out.println(d);
    }
}
