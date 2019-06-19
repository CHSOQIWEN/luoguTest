package com.chaoqiwen.Sixth;

import java.util.Scanner;

/**
 * https://www.luogu.org/problemnew/show/P1217
 * @author CHAOQIWEN
 * @data 2019/6/18 23:57
 */
public class HuiWenZhiShu {
    public static boolean ISzhishu(int a){
        int[] Math=new int[10];
        int i=0;
        while (a>0){
            Math[i]=a%10;
            a=a/10;
            i++;
        }
        for(int  j=0;j<i;j++){
            if(Math[j]!=Math[i-j-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean ISsushu(int a){
        if(a==1){
            return false;
        }else if(a%2==0||a%3==0){
            return false;
        }else {
            for (int i=5;i<a;i+=2){
                if(a%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public  static boolean Weishu(int a){

        if(a>10&&a<100&&a!=11||a>1000&&a<10000||a>100000&a<1000000||a>10000000&&a<100000000){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();

            for(int i=a;i<=b;i++){
                if(ISsushu(i)==true&&ISzhishu(i)==true&&Weishu(i)==true){
                    System.out.println(i);
                }
            }
        }

    }
}

