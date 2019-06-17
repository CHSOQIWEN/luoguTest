package com.chaoqiwen.Sixth;

import java.util.Scanner;

/**
 * https://www.luogu.org/problemnew/show/P1028
 * @author CHAOQIWEN
 * @data 2019/6/17 18:33
 */
public class ShuDeJiSuan {
    static int count=1;

    public static int  JiSuan(int n){
        
         for(int i=1;i<=n/2;i++){
             count++;
             JiSuan(i);
         }
         return count;


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int x=JiSuan(n);
            System.out.println(x);

        }
    }
}
