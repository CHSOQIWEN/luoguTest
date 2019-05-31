package com.chaoqiwen.Fourth;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/1 0:57
 */
/*
* 小鱼最近被要求参加一个数字游戏，
* 要求它把看到的一串数字（长度不一定，以0结束，最多不超过100个，数字不超过2^32-1），
* 记住了然后反着念出来(表示结束的数字0就不要念出来了)。
* 这对小鱼的那点记忆力来说实在是太难了，你也不想想小鱼的整个脑袋才多大，
* 其中一部分还是好吃的肉！所以请你帮小鱼编程解决这个问题。
*
* 输入格式：
一行内输入一串整数，以0结束，以空格间隔。

输出格式：
一行内倒着输出这一串整数，以空格间隔。
* */
public class FishMathGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[1024];

        for( int i=0;i<100000;i++){
            arr[i]=scanner.nextInt();
            if(arr[i]==0){
                break;
            }
        }

       // String str=arr.toString();
        int length=arr.length;

        for(int i=length-2;i>=0;i--){
            if(arr[i]==0){
                continue;
            }

            else {
                System.out.print(arr[i]+" ");
            }
        }
    }

}
