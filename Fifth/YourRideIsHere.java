package com.chaoqiwen.Fifth;

import java.util.Scanner;

/**
 * https://www.luogu.org/problemnew/show/P1200
 * @author CHAOQIWEN
 * @data 2019/6/17 18:12
 */
public class YourRideIsHere {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String HuiXing=scanner.next();
            char[] HuiXing1=HuiXing.toCharArray();
            String Queue=scanner.next();
            char[] Queue1=Queue.toCharArray();
            int count1=1;
            int count2=1;
            for(int i=0;i<HuiXing1.length;i++){
                count1*=HuiXing1[i]-64;


            }
            for(int i=0;i<Queue1.length;i++){
                count2*=Queue1[i]-64;
            }

            if(count1%47==count2%47){
                System.out.println("GO");
            }else {
                System.out.println("STAY");
            }

        }
    }
}
