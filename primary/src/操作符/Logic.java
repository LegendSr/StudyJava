package 操作符;

/**
 * @description: 逻辑操作符
 * @author: Hg
 * @create: 2020-06-05 10:10
 **/
public class Logic {
    /**
     * @Description: 逻辑操作符
     * @Param: [args]
     * @return: void
     * @Author: Hg
     * @Date: 2020/6/5
    */
    public static void main(String[] args) {
        int i=1;
        boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(b);
    }
}
