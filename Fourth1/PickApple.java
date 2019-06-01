package com.chaoqiwen.Fourth;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/5/31 11:25
 */
/*
输入格式：
        输入包括两行数据。
        第一行包含1010个100100到200200之间（包括100100和200200）的整数（以厘米为单位）
        分别表示1010个苹果到地面的高度，两个相邻的整数之间用一个空格隔开。
        第二行只包括一个100100到120120之间（包含100100和120120）的整数（以厘米为单位），
        表示陶陶把手伸直的时候能够达到的最大高度。

输出格式：
        输出包括一行，这一行只包含一个整数，表示陶陶能够摘到的苹果的数目。

 */
public class PickApple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] apple=new int[10];
        for(int i=0;i<10;i++){
            apple[i]=scanner.nextInt();
            //System.out.println(apple[i]);
        }
        int height=scanner.nextInt();
        int count=0;
        for(int i=0;i<10;i++){
            if(apple[i]<=height+30){
                count++;
            }
        }
        System.out.println(count);
    }
}
