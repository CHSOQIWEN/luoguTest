package com.chaoqiwen.Fourth;

/**
 * @author CHAOQIWEN
 * @data 2019/6/1 20:48
 */

import java.util.Scanner;

/**
 * 题目描述
 *
 *     某学校的珠心算老师采用一种快速考察珠心算加法能力的测验方法。
 *     他随机生成一个正整数集合，集合中的数各不相同，
 *     然后要求学生回答：其中有多少个数，恰好等于集合中另外两个（不同的）数之和？
 *
 * 输入格式：
 * 共两行，第一行包含一个整数n，表示测试题中给出的正整数个数。
 *
 * 第二行有n个正整数，每两个正整数之间用一个空格隔开，表示测试题中给出的正整数。
 *
 * 输出格式：
 * 一个整数，表示测验题答案。
 *
 * 输入：
 *    4
 *    1 2 3 4
 *
 * 输出：
 *   2
 *
 * */
public class AbacusQuiz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//数字个数
        int[] arr=new int[n];
        int[] isrepeat=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            isrepeat[i]=2;
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int x=0;x<n;x++){
                    if(arr[i]+arr[j]==arr[x]&&isrepeat[x]!=1){
                        count++;
                        isrepeat[x]=1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
