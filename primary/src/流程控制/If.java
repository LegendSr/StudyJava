package 流程控制;

import java.util.Scanner;

/**
 * @description: if
 * @author: Hg
 * @create: 2020-06-05 10:18
 **/
public class If {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入1进入判断肥胖程序，输入2进入判断闰年程序");
        if (s.nextInt() == 1) {
            sunBMI();
        } else {
            sunLeapMonth();
        }
    }

    private static void sunLeapMonth() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个年份来判断是否是闰年");
        int year = s.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("是闰年");
        }else if(year%400==0){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }

    private static void sunBMI() {
        Scanner s = new Scanner(System.in);
        System.out.println("开始计算BMI");
        System.out.println("输入体重（Kg）");
        float weight = s.nextFloat();
        System.out.println("输入身高(M)");
        float hight = s.nextFloat();
        float sum = weight / (hight * hight);
        System.out.println("BMI值为:" + sum);
        if(sum<18.5){
            System.out.println("身体状态:"+"体重过轻");
        }else if(18.5<=sum && sum <24){
            System.out.println("身体状态:"+"正常范围");
        }else if(24<=sum && sum <27){
            System.out.println("身体状态:"+"体重过重");
        }else if(27<=sum && sum <30){
            System.out.println("身体状态:"+"轻度肥胖");
        }else if(30<=sum && sum <35){
            System.out.println("身体状态:"+"中度肥胖");
        }else if(35<=sum){
            System.out.println("身体状态:"+"重度肥胖");
        }
    }
}
