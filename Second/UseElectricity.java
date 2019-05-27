package com.chaoqiwen.Second;

import java.util.Scanner;

public class UseElectricity {
    public static double price(int n){
        double p=0;
        if(n<=150){
            p=  (n*0.4463);
        }else if(n>150&&n<400){
            p=150*0.4463+((n-150)*0.4663);
        }else {
            p=150*0.4463+250*0.4663+((n-400)*0.5663);
        }
        p=Math.round(p*10)/10.0;
        return p;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(price(n));

    }
}
