package com.chaoqiwen.First;

import java.util.Scanner;

public class AddTime {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int add=(c*60+d)-(a*60+b);
        int time_h=add/60;
        int time_m=add%60;
        System.out.println(time_h+" "+time_m);
    }
}
