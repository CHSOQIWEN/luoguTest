package com.bittch.Day_23;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/questionTerminal/473c219f9e4d4ab2851ed388895a9c86
 * @author CHAOQIWEN
 * @data 2019/6/13 23:50
 */
public class NumberClassify {
    public static void A1(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%10==0){
                count+=array[i];
            }
        }
        if(count!=0) {
            System.out.print(count+" ");
        }else {
            System.out.print("N"+" ");
        }

    }
    public static void A2(int[] array){
        int[] b=new int[array.length];
        int e=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%5==1){
                b[e++]=array[i];
            }
        }
        int count1=0;
        int count2=0;
        int tmp=0;

        for(int i=0;i<b.length;i+=2){
            count1+=b[i];
        }
        for(int i=1;i<b.length;i+=2){
            count2+=b[i];
        }
        count2=-count2;
        tmp=count1+count2;
        if(tmp!=0){
            System.out.print(tmp+" ");
        }else {
            System.out.print("N"+" ");
        }

    }
    public static void A3(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%5==2){
                count++;
            }
        }
        if(count!=0){
            System.out.print(count+" ");
        }else {
            System.out.print("N"+" ");
        }
    }
    public static void A4(int[] array){
        int count=0;
        int tmp=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%5==3){
                tmp+=array[i];
                count++;
            }
        }
        double x=(double)tmp/count;

        double x1=(double)(Math.round(x*10)/10.0);
        if(x1!=0.0){
            System.out.print(x1+" ");
        }else {
            System.out.print("N"+" ");
        }

    }
    public static void A5(int[] array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%5==4){
                if(max<array[i]){
                    max=array[i];
                }
            }
        }
        if(max!=0){
            System.out.print(max+" ");
        }else {
            System.out.print("N");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] array=new int[N];
        for(int i=0;i<N;i++){
            array[i]=scanner.nextInt();
        }
        A1(array);
        //System.out.println(A2(array)+" "+A3(array)+" "+A4(array)+" "+A5(array));
        A2(array);
        A3(array);
        A4(array);
        A5(array);

    }
}
