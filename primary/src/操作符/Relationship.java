package 操作符;

import java.util.Scanner;

/**
 * @description: 关系操作符
 * @author: Hg
 * @create: 2020-06-05 10:02
 **/
public class Relationship {
    /**
     * @Description: 输入两个值，判断他们的关系
     * @Param: [args]
     * @return: void
     * @Author: Hg
     * @Date: 2020/6/5
    */
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("请输入两个值，以判断他们的关系");
        int i = s.nextInt();
        int j = s.nextInt();
        System.out.println("比较"+i+">"+j+":"+(i>j));
        System.out.println("比较"+i+">="+j+":"+(i>=j));
        System.out.println("比较"+i+"<"+j+":"+(i<j));
        System.out.println("比较"+i+"<="+j+":"+(i<=j));
        System.out.println("比较"+i+"=="+j+":"+(i==j));
        System.out.println("比较"+i+"!="+j+":"+(i!=j));
    }
}
