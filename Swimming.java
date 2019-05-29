package com.chaoqiwen.Third;

import java.util.Scanner;

public class Swimming {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n =scanner.nextDouble();
        double x=2;
        double y=2;
        int count=1;
        while (y<n){
            x=x*0.98;
            y=y+x;
            count++;

        }
        System.out.print(count);
    }

}
