package com.chaoqiwen.Seventh;

import java.util.Scanner;

/**
 * https://www.luogu.org/problemnew/show/P1003
 * @author CHAOQIWEN
 * @data 2019/6/19 17:00
 */
public class Carpeting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] a=new int[10001];
        int[] b=new int[10001];
        int[] g=new int[10001];
        int[] k=new int[10001];
        boolean tmp=false;

        while (scanner.hasNext()){
            int n=scanner.nextInt();//地毯总数
            for(int i=1;i<=n;i++){
                 a[i]=scanner.nextInt();//地毯左下角的x坐标
                 b[i]=scanner.nextInt();//地毯左下角的y坐标
                 g[i]=scanner.nextInt();//地毯在x方向上的长度
                 k[i]=scanner.nextInt();//地毯在y方向上的长度

            }
            int x=scanner.nextInt();//选中点的x坐标
            int y=scanner.nextInt();//选中点的y坐标
            for(int i=n;i>=1;i--){
                if(a[i]<=x&&x<=a[i]+g[i]&&b[i]<=y&&y<=b[i]+k[i]){
                    System.out.println(i);
                    tmp=true;
                    break;
                }
            }
            if(tmp==false){
                System.out.println("-1");
            }

        }
    }
}
