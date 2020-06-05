package 变量;

import sun.text.normalizer.UCharacterIterator;

/**
 * @description: 变量
 * @author: Hg
 * @create: 2020-06-04 19:44
 **/
public class HelloWorld {
    public static void main(String[] args) {
        int year = 1949;
        byte b = 1;
        short s = 200;
        int i = 11;
        int i1 = 11;
        long l = 400;
        //如果超出范围会产生编译错误
        //byte b2=200;
        char c = '中';
        //只能存放一个字符，超过就会产生编译错误
        float f = 1.11f;
        double d = 2.22;
        boolean b1 = true;
        boolean b2 = false;

        float f2 = 3.14f;
        double d2 = 2.769343;
        int i2 = 365;
        char c2 = '吃';
        boolean b3 = false;
        String str = "不可描述";

        //数据转换
        char c1 = 'A';
        short s3 = 80;
        //类型不一样需要强转
        c = (char) s3;
        //直接转换会编译出错
        //s3=c;

        //高精度到低精度不需要强转
        long l1 = 50;
        long i3 = 50;
        l = i;

        byte b4 = 5;
        int i4 = 5;
        int i5 = 300;
        b4 = (byte) i4;
        b4 = (byte) i5;

        short a=1;
        short a2=2;
        int a3=a+a2;

        int i6=10;
        int i7=20;
        int i8=i6+i7;

        //变量命名
        int $a_3=3;
        String n="名字";
        String name="名字";
        String 我的名字="Hg";
        System.out.println(我的名字);
        final int i9=1;
        //i9=1;

        //表达式
        String s1="22";
        ;
        ;
        ;

    }
}
