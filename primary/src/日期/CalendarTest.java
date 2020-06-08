package 日期;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description:
 * @author: Hg
 * @create: 2020-06-08 11:16
 **/
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        Date date= calendar.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("今天是:"+sdf.format(date));
        calendar.add(Calendar.MONTH,2);
        calendar.set(Calendar.DATE,-3);
        System.out.println("下月倒数第三天"+sdf.format(calendar.getTime()));
    }
}
