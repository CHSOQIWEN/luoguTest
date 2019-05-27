package com.chaoqiwen.Second;

import java.util.Scanner;

public class BuyPencil {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int price=0;
        int minp=999999;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<3;i++){

            a=scanner.nextInt();
            b=scanner.nextInt();
            if(n%a!=0){
                price=(n/a+1)*b;
            }else {
                price=(n/a);
            }
            if(price<minp){
                minp=price;
            }
        }
        System.out.println(minp);
    }
}
