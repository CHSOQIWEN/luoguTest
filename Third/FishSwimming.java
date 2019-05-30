package com.chaoqiwen.Third;

import java.util.Scanner;

public class FishSwimming {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int Longth=0;



        for(int i=0;i<n;i++){
            if(x!=6&&x!=7){

                Longth+=250;

            }

            if(x==7){
                x=1;
            } else    x++;


        }


        System.out.print(Longth);
    }

}
