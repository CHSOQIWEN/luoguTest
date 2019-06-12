package com.chaoqiwen.Fifth;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/5 1:02
 */
/*
* 题目描述
一般的文本编辑器都有查找单词的功能，该功能可以快速定位特定单词在文章中的位置，有的还能统计出特定单词在文章中出现的次数。

现在，请你编程实现这一功能，具体要求是：给定一个单词，请你输出它在给定的文章中出现的次数和第一次出现的位置。
* 注意：匹配单词时，不区分大小写，但要求完全匹配，即给定单词必须与文章

中的某一独立单词在不区分大小写的情况下完全相同（参见样例1 ），如果给定单词仅是文章中某一单词的一部分则不算匹配（参见样例2 ）。
*
* 输入格式：
共22行。

第11行为一个字符串，其中只含字母，表示给定单词；

第22行为一个字符串，其中只可能包含字母和空格，表示给定的文章。

输出格式：
一行，如果在文章中找到给定单词则输出两个整数，两个整数之间用一个空格隔开，
* 分别是单词在文章中出现的次数和第一次出现的位置（即在文章中第一次出现时，
* 单词首字母在文章中的位置，位置从00 开始）；如果单词在文章中没有出现，则直接输出一个整数-1−1。
*
*
*
* */
public class TestBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String A = scanner.nextLine();
            char[] A1 = A.toCharArray();
            String B = scanner.nextLine();
            String[] B1 = B.split(" ");
            int count = 0;
            String x = "";
            int e = 99;
            for (int i = 0; i < A1.length; i++) {
                int y = (A1[i] - 'A') % 32 + 'a';
                x += (char) y;
            }
            for (int i = 0; i < B1.length; i++) {
                if (x.contains(B1[i]) == true) {
                    count++;
                    if (i < e) {
                        e = i;
                    }
                }
            }

            if (e == 99) {
                System.out.println(-1);
            } else {
                System.out.println(count + " " + e);
            }

        }
    }
}

