package com.chaoqiwen.Fourth;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/1 22:00
 */
public class AddDays2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int Temperature= 0 ;
        int count=1;
        int max=0,prev=0;
        prev = scanner.nextInt();
        for(int i=1;i<n;i++){
            Temperature = scanner.nextInt();
            if(Temperature>=prev){
                count++;
                if(count>max){
                    max=count;
                }
            }else {
                count=1;
            }
            prev = Temperature;
        }
        System.out.println(max);
    }
}
