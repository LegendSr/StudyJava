package 操作符;

import java.util.Scanner;

/**
 * @description: 计算BMI值
 * @author: Hg
 * @create: 2020-06-05 09:47
 **/
public class SunBMI {
    /**
     * @Description: 计算BMI 肥胖指数
     * @Param: [args]
     * @return: void
     * @Author: Hg
     * @Date: 2020/6/5
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("开始计算BMI");
        System.out.println("输入体重（Kg）");
        float weight=s.nextFloat();
        System.out.println("输入身高(M)");
        float hight=s.nextFloat();
        float sum=weight/(hight*hight);
        System.out.println("BMI值为:"+sum);
    }
}
