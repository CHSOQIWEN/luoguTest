package com.chaoqiwen.Fifth;

import java.util.Scanner;

/**
 * @author CHAOQIWEN
 * @data 2019/6/12 0:36
 */
public class PassWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String a = scanner.next();
            char[] a1 = a.toCharArray();
            String b = "";

            for (int i = 0; i < a1.length; i++) {
                int x=((a1[i]-'a')+n)%26+'a';
                b += (char) x;
            }
            System.out.println(b.toString());
            b="";
        }
    }
}

