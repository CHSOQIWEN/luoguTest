package com.chaoqiwen.Fifth;

/**
 * @author CHAOQIWEN
 * @data 2019/6/2 1:23
 */

import java.util.Scanner;

/**
 * 题目描述
 *
 * 每一本正式出版的图书都有一个ISBN号码与之对应，ISBN码包括9位数字、1位识别码和3位分隔符，
 * 其规定格式如x-xxx-xxxxx-x，其中符号-就是分隔符（键盘上的减号），
 * 最后一位是识别码，例如0-670-82162-4就是一个标准的ISBN码。
 * ISBN码的首位数字表示书籍的出版语言，例如00代表英语；第一个分隔符-之后的三位数字代表出版社，
 * 例如670670代表维京出版社；第二个分隔符后的五位数字代表该书在该出版社的编号；最后一位为识别码。
 *
 * 识别码的计算方法如下：
 *
 * 首位数字乘以1加上次位数字乘以2……以此类推，用所得的结果 mod11，
 * 所得的余数即为识别码，如果余数为1010，则识别码为大写字母XX。
 * 例如ISBN号码0-670-82162-4中的识别码4是这样得到的：对067082162这9个数字，
 * 从左至右，分别乘以1,2,...,91,2,...,9再求和，即0×1+6×2+……+2×9=1580×1+6×2+……+2×9=158，
 * 然后取158mod11的结果4作为识别码。
 *
 * 你的任务是编写程序判断输入的ISBN号码中识别码是否正确，
 * 如果正确，则仅输出Right；如果错误，则输出你认为是正确的ISBN号码。
 *
 * */
public class NumberOfIISBN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A = null;

           A=scanner.next();
           StringBuffer B=new StringBuffer();

        String[] a=A.split(" ");
        int e=0;
        int sum=0;
        for(int i=0;i<12;i++) {
            if(i==1||i==5||i==11){
                continue;
            }
            if(i==0) {
                e = (A.charAt(i) - 48) * (i + 1);
            }else if(i>1&&i<5){
                e = (A.charAt(i) - 48) * (i );
            }else if(i>5&&i<11){
                e = (A.charAt(i) - 48) * (i -1);
            }
            sum+=e;

        }


        if(sum%11==(A.charAt(12)-48)){
            System.out.println("Right");

        }


        else if(sum%11==10){
            if(A.charAt(12)=='X'){
                System.out.println("Right");
            }else {
                for (int i = 0; i < 12; i++) {

                    B.append(A.charAt(i));

                }
                B.append("X");
                System.out.println(B);
            }

        }
        else {
            for(int i=0;i<12;i++){

                B.append(A.charAt(i));

            }
            B.append(sum%11);
            System.out.println(B);
        }

    }
}
