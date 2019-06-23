package com.chaoqiwen.Sixth;

import java.util.Scanner;

/**
 * https://www.luogu.org/problemnew/show/P1217
 * @author CHAOQIWEN
 * @data 2019/6/18 23:57
 */
public class HuiWenZhiShu {
    public static boolean IShuiwen(int a) {
        int tmp=a;
        int sum=0;
        while (tmp!=0){
            sum=tmp%10+sum*10;
            tmp=tmp/10;
        }
        return sum==a;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        while (scanner.hasNext()){
            int a=scanner.nextInt();
            int  b=scanner.nextInt();
            if(b>10000000){
                b=9999999;
            }
            if(a%2 == 0) {
                a++;
            }
            if(a > b) {
                return;
            }
            int tmp = (int)Math.sqrt(b);
            boolean[] f=new boolean[100000005];
            for(int i=2;i<=tmp;i++){
                for(int j=2;j<=b/i;j++){
                    f[i*j]=true;
                }
            }
            for(int i=a;i<=b;i+=2){

                if(IShuiwen(i)==true && f[i]==false){
                    System.out.println(i);
                }
            }
        }

    }
}

