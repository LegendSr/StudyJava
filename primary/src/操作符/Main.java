package 操作符;

import java.util.Scanner;

/**
 * @description:操作符
 * @author: Hg
 * @create: 2020-06-05 09:37
 **/
public class Main {
    public static void main(String[] args) {
        int i = 10;
        int j=5;
        int a= i+j;
        int b=i-j;
        int c=i*j;
        int d=i/j;


        Scanner s= new Scanner(System.in);
        System.out.println("请输入两个数字");
        int in1 = s.nextInt();
        int in2 = s.nextInt();
        System.out.println("参数1:"+in1+",参数2:"+in2+"="+(in1+in2));


    }
}
