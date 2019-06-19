package com.chaoqiwen.Sixth;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/17 23:45
 */
public class ShuDeJiSuan2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int[] f=new int[1024];
            f[0]=f[1]=1;

            for(int i=2;i<=n;i++){
                if(i%2==0){
                    f[i]=f[i-1]+f[i/2];
                }else {
                    f[i]=f[i-1];
                }
            }

            System.out.println(f[n]);
        }
    }
}
