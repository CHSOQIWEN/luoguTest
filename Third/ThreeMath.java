package com.chaoqiwen.Third;

import java.util.Scanner;

public class ThreeMath {
    public static int isEqual(int a,int b,int c){
        int result=0;
        int[] num=new int[9];
        num[0]=a/100;
        num[1]=b/100;
        num[2]=c/100;
        num[3]=(a/10)%10;
        num[4]=(b/10)%10;
        num[5]=(c/10)%10;
        num[6]=a%10;
        num[7]=b%10;
        num[8]=c%10;
        if(num[0]!=0&&num[1]!=0&&num[2]!=0&&num[3]!=0
                &&num[4]!=0&&num[5]!=0&&num[6]!=0&&num[7]!=0&&num[8]!=0){//所有数字不为0
            for(int i=0;i<num.length-1;i++){
                for(int j=i+1;j<num.length;j++){
                    if(num[i]!=num[j]){
                        result++;
                    }else {
                        return 0;
                    }
                }
            }
        }
        return result;


    }


    public static void main(String[] args) {

        int num1=0;
        int num2=0;
        int num3=0;
        for(int i=1;i<=3;i++){//找百位
            for(int j=1;j<=9;j++){
                for(int k=1;k<=9;k++){
                    if(i==j||i==k||j==k){
                        continue;
                    }
                    num1=100*i+10*j+k;
                    num2=num1*2;
                    num3=num1*3;
                    if(num3>1000){
                        break;
                    }

                   if(isEqual(num1,num2,num3)!=0){
                      System.out.println(num1+" "+num2+" "+num3);

                   }
                }
            }

        }






    }


}
