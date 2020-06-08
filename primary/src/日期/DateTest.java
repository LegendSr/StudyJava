package 日期;


import java.util.Date;

/**
 * @description: 日期
 * @author: Hg
 * @create: 2020-06-08 10:45
 **/
public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("当前时间:");
        System.out.println(d1.toString());
        System.out.println("当前时间getTime()返回值:"+d1.getTime());
        Date d2 = new Date(0);
        System.out.println("从1970年1月1日早上8点0分0秒开始经历了5秒的时间");
        System.out.println(d2.toString());
        System.out.println("当前时间getTime()返回值:"+d2.getTime());
        System.out.println("Date.getTime() \t\t\t返回值:"+new Date().getTime());
        System.out.println("System.currentTimeMillis() \t返回值:"+System.currentTimeMillis());

        //生成1995.1.1 00:00:00到1995.12.31 23:59:59直接的随机日期
        long sec=1000;
        long min=sec*60;
        long hour=min*60;
        long day=hour*24;
        long year=day * 365;
        long leapyear=6*day;
        Date date1995=new Date(1000*60*60*24);
        long postTimeStart=(1995-1970)*year+leapyear-8*hour;
        long postTimeEnd=(1996-1970)*year+leapyear-8*hour-1*sec;
        long random=(long)(Math.random()*(postTimeEnd-postTimeStart));
        System.out.println("1995年第一天"+new Date(postTimeStart));
        System.out.println("1995年最后一天"+new Date(postTimeEnd));
        System.out.println("随机时间:"+new Date(postTimeStart+random));
    }
}
