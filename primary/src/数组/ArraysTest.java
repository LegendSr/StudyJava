package 数组;

import java.util.Arrays;

/**
 * @description: Arrays练习
 * @author: Hg
 * @create: 2020-06-05 11:05
 **/
public class ArraysTest {
    public static void main(String[] args) {
        System.out.println("CopyOfRange");
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int[] b= Arrays.copyOfRange(a,0,3);
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("数字62出现的位置"+Arrays.binarySearch(a,62));

    }
}
