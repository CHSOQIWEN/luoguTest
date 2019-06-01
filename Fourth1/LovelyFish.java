package com.chaoqiwen.Fourth;

/**
 * @author CHAOQIWEN
 * @data 2019/6/1 15:04
 */

import java.util.Scanner;

/**
 * 题目描述
 *
 * 人比人，气死人；鱼比鱼，难死鱼。
 * 小鱼最近参加了一个“比可爱”比赛，比的是每只鱼的可爱程度。
 * 参赛的鱼被从左到右排成一排，头都朝向左边，然后每只鱼会得到一个整数数值，
 * 表示这只鱼的可爱程度，很显然整数越大，表示这只鱼越可爱，而且任意两只鱼的可爱程度可能一样。
 * 由于所有的鱼头都朝向左边，所以每只鱼只能看见在它左边的鱼的可爱程度，
 * 它们心里都在计算，在自己的眼力范围内有多少只鱼不如自己可爱呢。
 * 请你帮这些可爱但是鱼脑不够用的小鱼们计算一下。
 *输入格式：
 * 第一行输入一个整数n，表示鱼的数目。
 *
 * 第二行内输入n个整数，用空格间隔，依次表示从左到右每只小鱼的可爱程度。
 *
 * 输出格式：
 * 行内输出n个整数，用空格间隔，依次表示每只小鱼眼中有多少只鱼不如自己可爱。
 *
 *
 * 输入：
 *    6
 *    4 3 0 5 1 2
 *
 * 输出：
 * 0 0 0 3 1 2
 * */
public class LovelyFish {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//小鱼的数量
        int[] tmp=new int[n];
        for(int i=0;i<n;i++){
             tmp[i]=scanner.nextInt();//每个小鱼的可爱值
        }

        int[] love=new int[n];
        love[0]=0;
        for(int i=1;i<n;i++){

            for (int j=i;j>=0;j--){
                if(tmp[i]>tmp[j]){
                    love[i]++;
                }
            }


        }
        for(int i=0;i<n;i++){
            System.out.print(love[i]+" ");
        }

    }
}
